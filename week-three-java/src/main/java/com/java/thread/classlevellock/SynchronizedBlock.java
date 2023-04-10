package com.java.thread.classlevellock;

// Write a program for Class level lock using Synchronization
public class SynchronizedBlock implements Runnable {
    @Override
    public void run(){
        methodLock();
    }

    public void methodLock(){
        System.out.println(
            Thread.currentThread().getName() + " entered methodLock()");

        synchronized (SynchronizedBlock.class){
            System.out.println(Thread.currentThread().getName() + " entered synchronized block");
            System.out.println("Executing task");
            System.out.println(Thread.currentThread().getName() + " at the end synchronized block");
        }

        System.out.println(Thread.currentThread().getName() + " at end of methodLock()");
    }
    
    public static void main(String[] args) {
        SynchronizedBlock block1 = new SynchronizedBlock();
        Thread thread1 = new Thread(block1);
        SynchronizedBlock block2 = new SynchronizedBlock();
        Thread thread2 = new Thread(block2);
        Thread thread3 = new Thread(block2);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
