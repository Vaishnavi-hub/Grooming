package com.java.thread.producerconsumer;

public class ProducerConsumer {

    private static final Object lock = new Object();
    private static int value = 0;
    private static boolean available = false;

    public static void main(String[] args) {

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                synchronized (lock) {
                    while (available) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    value++;
                    System.out.println("Producer value: " + value);
                    available = true;
                    lock.notify();
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                synchronized (lock) {
                    while (!available) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Consumer value got: " + value);
                    available = false;
                    lock.notify();
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}