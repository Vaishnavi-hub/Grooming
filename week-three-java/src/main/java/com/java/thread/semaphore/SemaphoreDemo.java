package com.java.thread.semaphore;

import java.util.concurrent.Semaphore;

// Write a program for Semaphore
public class SemaphoreDemo {
    private static final int MAX_CONCURRENT_TASKS = 2;
    private static final int NUM_TASKS = 5;
    private static final Semaphore semaphore = new Semaphore(MAX_CONCURRENT_TASKS);

    public static void main(String[] args) {
        // Create and start threads
        for (int i = 1; i <= NUM_TASKS; i++) {
            Thread thread = new Thread(new Worker("Thread-" + i));
            thread.start();
        }
    }

    public static class Worker implements Runnable {
        private final String threadName;

        public Worker(String threadName) {
            this.threadName = threadName;
        }

        public void run() {
            try {
                // Acquire a permit from the semaphore
                semaphore.acquire();
                System.out.println(threadName + " acquired a permit");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Release the permit back to the semaphore
                semaphore.release();
                System.out.println(threadName + " released a permit");
            }
        }
    }
}

