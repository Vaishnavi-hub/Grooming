package com.vaishu.thread.threadclass;

class SyncMethodThreadClass{
    public synchronized void increment(){
        Thread thread = Thread.currentThread();
        for (int i =1; i<= 5; i++){
            System.out.println(thread.getName() + " : " + i);
        }
    }
}
public class SyncMethod extends Thread {
    private SyncMethodThreadClass syncMethodThreadClass;

    public SyncMethod(SyncMethodThreadClass obj){
        this.syncMethodThreadClass = obj;
    }

    @Override
    public void run(){
        syncMethodThreadClass.increment();
    }

    public static void main(String[] args) {
        SyncMethodThreadClass obj = new SyncMethodThreadClass();
        SyncMethod thread1 = new SyncMethod(obj);
        thread1.setName("Thread-1");
        System.out.println("Thread Name: " + thread1.getName());
        System.out.println("Thread Priority: " + thread1.getPriority());
        System.out.println("Thread ID: " + thread1.getId());
        SyncMethod thread2 = new SyncMethod(obj);
        thread2.setName("Thread-2");
        thread1.start();
        thread2.start();
    }
}
