package com.vaishu.thread.runnableinterface;

public class StaticSyncMethodRunnable implements Runnable{
    private static int count = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            increment();
        }
    }

    public static synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " : " + count);
    }

    public static void main(String[] args) {
        StaticSyncMethodRunnable runnable1 = new StaticSyncMethodRunnable();
        StaticSyncMethodRunnable runnable2 = new StaticSyncMethodRunnable();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
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
