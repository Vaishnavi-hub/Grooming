package com.vaishu.filehandling;

import java.io.FileOutputStream;

public class FileOutputStreamClass {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\FileNew.txt");
            String s="File content created/modified using FileOutputStream write method";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("Successfully written");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
