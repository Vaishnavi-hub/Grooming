package com.vaishu.filehandling;

import java.io.FileInputStream;

public class FileInputStreamClass {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\FileNew.txt");
            int data=0;
            while((data=fin.read())!=-1){
                System.out.print((char)data);
            }
            fin.close();
        }catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
