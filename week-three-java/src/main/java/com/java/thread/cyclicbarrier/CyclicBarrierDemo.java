package com.java.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// Write a program for Cyclic barrier
public class CyclicBarrierDemo {
    private static final int THREAD_COUNT = 3;
    private static final CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT, () -> {
        System.out.println("All threads have reached the barrier point.");
    });

    public static void main(String[] args) {
        for (int i = 1; i <= THREAD_COUNT; i++) {
            Thread t = new Thread(new MyThread("Thread-" + i));
            t.start();
        }
    }

    public static class MyThread implements Runnable {
        private String threadName;

        public MyThread(String threadName) {
            this.threadName = threadName;
        }

        public void run() {
            try {
                System.out.println(threadName + " is waiting at the barrier point.");

                // Wait for all threads to arrive at the barrier point
                barrier.await();

                System.out.println(threadName + " has passed the barrier point.");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}

