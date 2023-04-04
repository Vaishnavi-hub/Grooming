package com.vaishu.thread.threadclass;

public class StaticSyncThreadClass extends Thread{
    private static int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            increment();
        }
    }

    public static synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
    }

    public static void main(String[] args) {
        StaticSyncThreadClass thread1 = new StaticSyncThreadClass();
        StaticSyncThreadClass thread2 = new StaticSyncThreadClass();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter value: " + count);
    }
}
