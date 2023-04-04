package com.vaishu.thread.runnableinterface;

class RunnableSyncBlock{
    public  void increment(){
        synchronized(this){
            Thread thread = Thread.currentThread();
            for (int i =1; i<= 5; i++){
                System.out.println(thread.getName() + " : " + i);
            }
        }
    }
}

public class SyncBlockRunnableInterface implements Runnable{
    private RunnableSyncBlock runnableSyncBlock;

    public SyncBlockRunnableInterface(RunnableSyncBlock obj){
        this.runnableSyncBlock = obj;
    }

    @Override
    public void run(){
        runnableSyncBlock.increment();
    }

    public static void main(String[] args) {
        RunnableSyncBlock obj = new RunnableSyncBlock();
        SyncBlockRunnableInterface syncBlockRunnableInterface1 = new SyncBlockRunnableInterface(obj);
        SyncBlockRunnableInterface syncBlockRunnableInterface2 = new SyncBlockRunnableInterface(obj);
        Thread thread1 = new Thread(syncBlockRunnableInterface1);
        thread1.setName("Thread-1");
        Thread thread2 = new Thread(syncBlockRunnableInterface2);
        thread2.setName("Thread-2");
        thread1.start();
        thread2.start();
    }
}
