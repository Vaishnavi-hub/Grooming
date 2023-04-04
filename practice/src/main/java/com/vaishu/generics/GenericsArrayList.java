package com.vaishu.generics;

import java.util.ArrayList;
import java.util.Iterator;

// Write custom Arraylist which accept any object and perform basic operations
public class GenericsArrayList <T> {

    ArrayList<T> list = new ArrayList<> ();

    public GenericsArrayList(ArrayList<T> list) {
        this.list = list;
    }

    public int sizeOfArrayList(){
        return list.size();
    }

    public boolean addElement(T element){
        return list.add(element);
    }

    public void addElementAtIndex(int index, T element){
        list.add(index, element);
    }

    public T getElement(int index){
        return list.get(index);
    }

    public T removeElement(int index){
        T removedElement = list.remove(index);
        return removedElement;
    }

    public Iterator<T> iteratorArrayList(){
        return list.iterator();
    }

    public static void main(String[] args) {

        // create ArrayList<String>
        GenericsArrayList<String> stringObj = new GenericsArrayList<>(new ArrayList<String>());
        System.out.println("Inserting elements to ArrayList<String>..........");
        stringObj.addElement("Hello");
        stringObj.addElement("Welcome");
        stringObj.addElement("Test");
        System.out.println("Adding element at index 1..........");
        stringObj.addElementAtIndex(1, "Generics");
        System.out.println("Size of ArrayList<String>..........");
        System.out.println(stringObj.sizeOfArrayList());
        System.out.println("Get element at index 2..........");
        System.out.println(stringObj.getElement(2));
        System.out.println("Removing element at index 2..........");
        stringObj.removeElement(2);
        System.out.println("Print elements in Arraylist<String>..........");
        Iterator<String> itr = stringObj.iteratorArrayList();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // create ArrayList<Integer>
        GenericsArrayList<Integer> integerObj = new GenericsArrayList<>(new ArrayList<Integer>());
        System.out.println("\nInserting elements to ArrayList<Integer>..........");
        integerObj.addElement(10);
        integerObj.addElement(43);
        System.out.println("Adding element at index 0..........");
        integerObj.addElementAtIndex(0, 25);
        System.out.println("Removing element at index 1..........");
        integerObj.removeElement(1);
        System.out.println("Print elements in Arraylist<Integer>..........");
        Iterator<Integer> itr2 = integerObj.iteratorArrayList();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
