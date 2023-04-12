package com.java.thread.customthreadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

// write a program to create custom Thread pool. It should accept runnable task and execute it.
public class CustomThreadPool {
    private final int nThreads;
    private final PoolWorker[] threads;
    private final BlockingQueue<Runnable> queue;
    private AtomicBoolean isThreadPoolShutDownInitiated;

    public CustomThreadPool(int nThreads) {
        this.nThreads = nThreads;
        queue = new LinkedBlockingQueue<>();
        threads = new PoolWorker[nThreads];
        this.isThreadPoolShutDownInitiated = new AtomicBoolean(false);

        for (int i = 0; i < nThreads; i++) {
            threads[i] = new PoolWorker();
            threads[i].start();
        }
    }

    public void execute(Runnable task) {
        if(isThreadPoolShutDownInitiated.get() == false){
            synchronized (queue) {
                queue.add(task);
                queue.notify();
            }
        }
    }

    public synchronized void shutdown() {
        isThreadPoolShutDownInitiated = new AtomicBoolean(true);
        System.out.println("Shutdown Threadpool");
        for (PoolWorker thread: threads) {
            thread.interrupt();
        }
    }

    public static void main(String[] args) {
        CustomThreadPool threadPool = new CustomThreadPool(3);
        for (int i = 1; i <= 7; i++) {
            int taskNumber = i;
            threadPool.execute(() -> {
                System.out.println("Task " + taskNumber + " is being executed by " + Thread.currentThread().getName());
            });
            System.out.println(taskNumber);
            if(taskNumber == 7){
                threadPool.shutdown();
            }
        }

    }
    class PoolWorker extends Thread {
        public void run() {
            try {
                while (!isThreadPoolShutDownInitiated.get()) {
                    Runnable task;
                    synchronized (queue) {
                        while (queue.isEmpty()) {
                            try {
                                queue.wait();
                            } catch (InterruptedException e) {
                                System.out.println(Thread.currentThread().getName() + " interrupted");
                            }
                        }
                        task = queue.poll();
                    }

                    // Execute the task
                    try {
                        task.run();
                    } catch (RuntimeException e) {
                        System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());
                    }
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
