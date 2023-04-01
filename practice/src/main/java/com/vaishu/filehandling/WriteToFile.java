package com.vaishu.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\File1.txt");
            fileWriter.write("This file is created using java.io package.");
            fileWriter.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    
}
