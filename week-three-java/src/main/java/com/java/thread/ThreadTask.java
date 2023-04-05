package com.java.thread;

public class ThreadTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing the task");
    }

    public static void main(String[] args) {
        
        ThreadTask task = new ThreadTask();
        Thread thread = new Thread(task, "myThread"); // Create a Thread and pass task to the constructor
        thread.start(); // Start the thread to execute the task
    }
}
