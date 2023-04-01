package com.vaishu.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\File2.txt");
            if(file.createNewFile()){
                System.out.println("File Created: " + file.getName());
            }
            else{
                System.out.println("File Already Exists");
            }
            
        }
        catch (IOException e) {
            System.out.println("An error occurred while creating the file");
        }
    }
    
}
