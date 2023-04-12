package com.java.thread.threadlocal;

// Write a program for ThreadLocal
public class ThreadLocalDemo {
    public static void main(String[] args)
    {
        MyRunnable runnableInstance = new MyRunnable();

        Thread t1 = new Thread(runnableInstance);
        Thread t2 = new Thread(runnableInstance);

        // Two thread trying to access and modify ThreadLocal variable
        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable
{
    private ThreadLocal<Integer> threadLocal =
            new ThreadLocal<Integer>();

    @Override
    public void run() {
        threadLocal.set(0);
        System.out.println("Initial value: " + threadLocal.get());
        for(int i = 1; i<=2; i++){
            if(threadLocal.get() == null){
                threadLocal.set(1);
            }
            else{
                threadLocal.set((int) (i));
            }
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + ": " + threadLocal.get());
        }
    }
}

