package com.java.thread;

public class ThreadPriority extends Thread {
    public void run() {
        // Do some work
        System.out.println("Thread running with priority " + getPriority());
    }

    public static void main(String[] args) {
        // Create an instance of MyThread
        ThreadPriority thread1 = new ThreadPriority();

        // Start the thread
        thread1.start();

        // Create an instance of MyThread
        ThreadPriority thread2 = new ThreadPriority();

        // Set the thread priority to minimum
        thread2.setPriority(Thread.MIN_PRIORITY);

        // Start the thread
        thread2.start();

        // Create an instance of MyThread
        ThreadPriority thread3 = new ThreadPriority();

        // Set the thread priority to minimum
        thread3.setPriority(Thread.MAX_PRIORITY);

        // Start the thread
        thread3.start();
    }
}
