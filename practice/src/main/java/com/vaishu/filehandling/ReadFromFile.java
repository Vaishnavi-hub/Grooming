package com.vaishu.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\File1.txt");
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    
}
