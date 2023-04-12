package com.java.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

// Create a Main Task and multiple subtasks. Main task will start execute only after the subtasks were completed.
public class MainTask {
    public static void main(String[] args) throws InterruptedException {
        // create CountDownLatch with 5 subtasks
        int numSubTasks = 5;
        CountDownLatch latch = new CountDownLatch(numSubTasks);

        // create and start subtasks
        for (int i = 0; i < numSubTasks; i++) {
            SubTask subTask = new SubTask(latch);
            subTask.start();
        }

        // blocks main thread until all the subtasks completed
        latch.await();

        // start main task
        System.out.println("Main task starting...");
    }
}

class SubTask extends Thread {
    private CountDownLatch latch;

    public SubTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        
        System.out.println("Subtask " + Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Subtask " + Thread.currentThread().getName() + " completed");
        
        // decrement count on latch and send signal to main task
        latch.countDown();
    }
}