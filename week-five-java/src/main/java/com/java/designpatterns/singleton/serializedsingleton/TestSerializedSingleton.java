package com.java.designpatterns.singleton.serializedsingleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializedSingleton {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // get created instance
        SerializedSingleton instance1 = SerializedSingleton.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\java\\Grooming\\week-five-java\\src\\main\\java\\com\\java\\designpatterns\\singleton\\serializedsingleton\\serializedsingleton.ser")));
        objectOutputStream.writeObject(instance1);

        SerializedSingleton instance2 = null;
        ObjectInputStream ObjectInputStream = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\vaia\\Documents\\ASDEs Grooming Sessions\\java\\Grooming\\week-five-java\\src\\main\\java\\com\\java\\designpatterns\\singleton\\serializedsingleton\\serializedsingleton.ser")));

        instance2 = (SerializedSingleton) ObjectInputStream.readObject();

        objectOutputStream.close();
        ObjectInputStream.close();

        // checking both instance1 and instance2 referring to the same single instance created
        System.out.println(instance1 == instance2); // prints false without readResolve method
    }
}
