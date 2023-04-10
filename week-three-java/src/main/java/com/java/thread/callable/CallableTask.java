package com.java.thread.callable;

import java.util.concurrent.Callable;

// Write a program create task using Callable interface.
public class CallableTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Task created using Callable interface";
    }
    
    public static void main(String[] args) throws Exception {
        CallableTask task = new CallableTask();

        String result = task.call();

        System.out.println("Result: " + result);
    }
}
