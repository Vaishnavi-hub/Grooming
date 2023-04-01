package com.vaishu.filehandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\File2.txt");
        if(file.delete()){
            System.out.println("File successfully deleted");
        }
        else{
            System.out.println("unexpected error found in deletion of the file");
        }
    }
    
}
