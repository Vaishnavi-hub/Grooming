package com.vaishu.filehandling;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\File1.txt");
        if(file.exists()){
            System.out.println("File Name: "+ file.getName());
            System.out.println("File Path: "+ file.getAbsolutePath());
            System.out.println("File Size in Bytes: "+ file.length());
            System.out.println("Is File Readable: "+ file.canRead());
            System.out.println("Is File Writable: "+ file.canWrite());
        }
        else{
            System.out.println("File doesn't exists");
        }
    }
    
}
