package com.java.thread.daemon;

// Write a program to create Daemon Thread.
// Write a program to verify Thread is Daemon Thread?
public class DaemonThread extends Thread{
    
    @Override
    public void run(){
        if(Thread.currentThread().isDaemon()){

            System.out.println("Daemon Thread is running");
        }
        else{
            System.out.println("Normal Thread is running");
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon Thread");
        daemonThread.setDaemon(true);
        daemonThread.start();

        DaemonThread normalThread = new DaemonThread();
        normalThread.setName("Normal Thread");
        normalThread.start();
    }
    
}
