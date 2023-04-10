package com.java.thread.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Write a program to create Executor Service using Cached Thread pool and store the result of the future task in the Arraylist.
public class CachedThreadPool {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // creating cached thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        List<Future<Integer>> futureList = new ArrayList<>();
        for(int i = 1; i <= 5; i++ ){
            // submit the task for execution
            Future<Integer> future = executorService.submit(new Task(i));
            futureList.add(future);
        }

        List<Integer> resultList = new ArrayList<>();
        for (Future<Integer> future : futureList) {
            // get the future placeholder value, until the value is present in the placeholder, future.get() will be blocked
            resultList.add(future.get());
        }

        System.out.println("Result: " + resultList);

        // shutdown the executor service after completing all the tasks
        executorService.shutdown();
    }
}

class Task implements Callable<Integer> {
    private final int value;

    public Task(int value) {
        this.value = value;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Task " + value + " started");
        Thread.sleep(1000);
        System.out.println("Task " + value + " completed");
        return value * value;
    }
    
}
