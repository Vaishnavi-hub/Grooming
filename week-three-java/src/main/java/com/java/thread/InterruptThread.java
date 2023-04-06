package com.java.thread;

public class InterruptThread extends Thread {
    public void run(){  
        for(int i=1;i<=3;i++){ 
            System.out.println(Thread.currentThread().getName() + " isInterrupted(): " + isInterrupted()); 
            
            // check the thread is interrupted or not
            if(isInterrupted()){ 
                if(i == 2){
                    // reset the interrupted flag to false
                    System.out.println(Thread.currentThread().getName() + " interrupted(): " + Thread.interrupted());
                    System.out.println(Thread.currentThread().getName() + " isInterrupted(): " + isInterrupted());

                    System.out.println(Thread.currentThread().getName() + " is running after setting the interrupted flag to false"); 
                }
                else{
                    System.out.println(Thread.currentThread().getName() + " is interrupted while running");
                }
            }  
            else{  
                System.out.println(Thread.currentThread().getName() + " is running");  
            }  
        }
    }  
    
    public static void main(String args[]){  
    
        InterruptThread thread1=new InterruptThread();
        
        thread1.start();
        thread1.interrupt();        
    }
    
}
