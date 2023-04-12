package com.java.thread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Write a program for Blocking Queue
public class BlockingQueueDemo {
    private static final int QUEUE_CAPACITY = 5;
    private static final BlockingQueue<String> queue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);

    public static void main(String[] args) {
        // Create and start producer and consumer threads
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());
        producerThread.start();
        consumerThread.start();
    }

    public static class Producer implements Runnable {
        public void run() {
            try {
                for (int i = 1; i <= QUEUE_CAPACITY; i++) {
                    String task = "Task-" + i;
                    // Add task to the queue
                    queue.put(task);
                    System.out.println(task + " inserted to the queue");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Consumer implements Runnable {
        public void run() {
            try {
                for (int i = 1; i <= QUEUE_CAPACITY; i++) {
                    // Retrieve element from the queue
                    String task = queue.take();
                    System.out.println(task + " consumed from the queue");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

