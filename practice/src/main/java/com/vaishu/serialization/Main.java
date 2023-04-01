package com.vaishu.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Serialize
        Employee e = new Employee();
        e.setId(1);
        e.setName("Vaishnavi");

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\SerializationDemo\\serialization.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);
        objectOutputStream.close();
        fileOutputStream.close();

        //deserialize
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\Week 2\\SerializationDemo\\serialization.ser");
        ObjectInputStream ObjectInputStream = new ObjectInputStream(fileInputStream);
        Employee reCreatedObjEmployee = (Employee) ObjectInputStream.readObject();
        System.out.println(reCreatedObjEmployee.getName());
        ObjectInputStream.close();
        fileInputStream.close();
    }
}
