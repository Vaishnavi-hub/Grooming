package com.java.thread.printsequence;

// program to print a sequence of numbers up to N using 3 threads.
public class PrintSequence implements Runnable {
    private final int index;
    private final int maxCount;
    private static volatile int currentCount = 1;
    private static final Object lock = new Object();

    public PrintSequence(int index, int maxCount) {
        this.index = index;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        while (true) {
            // acquire lock on this block
            synchronized (lock) {
                if (currentCount > maxCount) {
                    return;
                }
                // condition to print the sequence of numbers in thread order
                if (currentCount % 3 == index) {
                    System.out.println(Thread.currentThread().getName()+ " : " + currentCount);
                    currentCount++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int maxCount = 10;
        PrintSequence thread1 = new PrintSequence(1, maxCount);
        PrintSequence thread2 = new PrintSequence(2, maxCount);
        PrintSequence thread3 = new PrintSequence(0, maxCount);

        Thread t1 = new Thread(thread1, "Thread-1");
        Thread t2 = new Thread(thread2, "Thread-2");
        Thread t3 = new Thread(thread3, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
