package com.java.thread;

public class ThreadClass extends Thread {

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running");
    }
    public static void main(String[] args) {
        ThreadClass myThread = new ThreadClass();
        myThread.setName("MyThread");
        myThread.run(); // no new thread is created, run method executed by main thread
        myThread.start(); // new thread is created, run method executed by MyThread
    }
}
