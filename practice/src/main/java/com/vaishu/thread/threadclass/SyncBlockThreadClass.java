package com.vaishu.thread.threadclass;

class ThreadClassSyncBlock{
    public  void increment(){
        synchronized(this){
            Thread thread = Thread.currentThread();
            for (int i =1; i<= 5; i++){
                System.out.println(thread.getName() + " : " + i);
            }
        }
    }
}
public class SyncBlockThreadClass extends Thread{
    private ThreadClassSyncBlock threadClassSyncBlock;

    public SyncBlockThreadClass(ThreadClassSyncBlock obj){
        this.threadClassSyncBlock = obj;
    }

    @Override
    public void run(){
        threadClassSyncBlock.increment();
    }

    public static void main(String[] args) {
        ThreadClassSyncBlock obj = new ThreadClassSyncBlock();
        SyncBlockThreadClass thread1 = new SyncBlockThreadClass(obj);
        thread1.setName("Thread-1");
        SyncBlockThreadClass thread2 = new SyncBlockThreadClass(obj);
        thread2.setName("Thread-2");
        thread1.start();
        thread2.start();
    }
}
