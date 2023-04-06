package com.java.thread;

public class ThreadJoin extends Thread{
    public void run() {
        // Do some work
        System.out.println(getName() + " running");

        try {
            // Sleep for 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " finished");
    }

    public static void main(String[] args) {
        ThreadJoin thread1 = new ThreadJoin();
        ThreadJoin thread2 = new ThreadJoin();

        // Starting the threads
        thread1.start();
        thread2.start();

        try {
            // join method allows both threads to wait until both thread tasks finishes
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " running");

        System.out.println("All threads finished, exiting main thread");
    }
}
