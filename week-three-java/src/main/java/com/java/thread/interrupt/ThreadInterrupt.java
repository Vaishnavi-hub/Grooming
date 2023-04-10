package com.java.thread.interrupt;

// // Write a program to interrupt a thread.
public class ThreadInterrupt extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " executing the task");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " got interrupted");
        }
    }

    public static void main(String[] args) {
        ThreadInterrupt thread = new ThreadInterrupt();
        thread.start();
        thread.interrupt();
    }
}
