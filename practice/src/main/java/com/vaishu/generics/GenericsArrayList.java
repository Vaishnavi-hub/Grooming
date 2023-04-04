package com.vaishu.generics;

import java.util.ArrayList;
import java.util.Iterator;

// Write custom Arraylist which accept any object and perform basic operations
public class GenericsArrayList <T> {
    private Object[] elements;
    private int size;

    public GenericsArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void addElement(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = element;
        size++;
    }

    public T getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public static void main(String[] args) {

        // create String Array
        GenericsArrayList<String> stringObj = new GenericsArrayList<>();
        System.out.println("Inserting elements to String[]..........");
        stringObj.addElement("Hello");
        stringObj.addElement("Welcome");
        stringObj.addElement("Test");
        stringObj.addElement("Objects");
        System.out.println("Get element at index 2..........");
        System.out.println(stringObj.getElement(2));
        System.out.println("Removing element at index 2..........");
        stringObj.removeElement(2);
        System.out.println("Print elements in String[]..........");
        for(int i =0; i< stringObj.getSize() - 1; i++){
            System.out.println(stringObj.getElement(i));
        }

        // create Integer Array
        GenericsArrayList<Integer> integerObj = new GenericsArrayList<>();
        System.out.println("\nInserting elements to Integer[]..........");
        integerObj.addElement(10);
        integerObj.addElement(43);
        integerObj.addElement(25);
        integerObj.addElement(88);
        integerObj.addElement(39);
        System.out.println("Removing element at index 1..........");
        integerObj.removeElement(1);
        System.out.println("Size of Integer[]..........");
        System.out.println(stringObj.getSize());
        System.out.println("Print elements in Integer[]..........");
        for(int i =0; i< integerObj.getSize() - 1; i++){
            System.out.println(integerObj.getElement(i));
        }
    }
}
