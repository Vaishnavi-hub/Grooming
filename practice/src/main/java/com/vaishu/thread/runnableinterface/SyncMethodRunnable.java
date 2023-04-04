package com.vaishu.thread.runnableinterface;

class RunnableSyncMethod{
    public synchronized void increment(){
        Thread thread = Thread.currentThread();
        for (int i =1; i<= 5; i++){
            System.out.println(thread.getName() + " : " + i);
        }
    }
}

public class SyncMethodRunnable implements Runnable {
    private RunnableSyncMethod syncMethodThreadClass;

    public SyncMethodRunnable(RunnableSyncMethod obj){
        this.syncMethodThreadClass = obj;
    }

    @Override
    public void run(){
        syncMethodThreadClass.increment();
    }

    public static void main(String[] args) {
        RunnableSyncMethod obj = new RunnableSyncMethod();
        SyncMethodRunnable syncMethodRunnable1 = new SyncMethodRunnable(obj);
        SyncMethodRunnable syncMethodRunnable2 = new SyncMethodRunnable(obj);
        Thread thread1 = new Thread(syncMethodRunnable1);
        thread1.setName("Thread-1");
        Thread thread2 = new Thread(syncMethodRunnable2);
        thread2.setName("Thread-2");
        System.out.println("Thread-2 Name: " + thread2.getName());
        System.out.println("Thread-2 Priority: " + thread2.getPriority());
        System.out.println("Thread-2 ID: " + thread2.getId());
        thread1.start();
        thread2.start();
    }
}
