package com.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import com.java8.lambda.Drawable;
import com.java8.lambda.Rectangle;

public class MethodReference {
    public static void drawImp(){
        System.out.println("Drawing method executed using method reference");
    }

    public void ThreadStatus(){  
        System.out.println("Thread is running...");  
    } 

    public int area(int l, int b){
        return l * b;
    }
    public static void main(String[] args) {
        // method reference to static method
        Drawable drawable = MethodReference::drawImp;
        drawable.draw();

        // method reference to instance method using anonymous object
        Rectangle rectangle1 = new MethodReference()::area;
        System.out.println("Area of rectangle: " + rectangle1.area(5, 7));

        // method reference to instance method using instance reference to create Thread
        MethodReference methodReference = new MethodReference();
        Thread thread = new Thread(methodReference::ThreadStatus);
        thread.start();

        // method reference to constructor
        Drawable drawable2 = Message::new;
        drawable2.draw();

        // method reference in ForEach Loop
        List<String> list = new ArrayList<String>();  
        list.add("Agalya");
        list.add("Vinif");
        list.add("Tarini");
        list.add("Sujit");
        list.forEach(System.out::println);

    }
}
