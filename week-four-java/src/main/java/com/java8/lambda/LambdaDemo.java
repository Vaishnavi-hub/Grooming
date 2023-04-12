package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaDemo{
    public static void main(String[] args) {
        // lambda expression without parameters
        Drawable drawable = () -> System.out.println("Drawing method executed");
        drawable.draw();

        // lambda express with parameters and without return keyword
        Rectangle rectangle1 = (l, b) -> {return (l * b);};
        System.out.println("Area of rectangle: " + rectangle1.area(5, 7));

        // lambda express with parameters and with return keyword
        Rectangle rectangle2 = (int l, int b) -> {return (l * b);};
        System.out.println("Area of rectangle: " + rectangle2.area(50, 70));

        // lambda expression in ForEach Loop
        List<String> list = new ArrayList<String>();  
        list.add("Agalya");
        list.add("Vinif");
        list.add("Tarini");
        list.add("Sujit");
        list.forEach((ele) -> System.out.println(ele));

        //lambda expression with multiple statements
        Drawable drawable2 = () -> {
            String shape = "Triangle";
            System.out.println("Drawing " + shape + " shape");
        };
        drawable2.draw();

        // lambda expression to create Thread
        Runnable runnable = () -> {System.out.println("Thread running");};
        Thread thread = new Thread(runnable);
        thread.start();

        // lambda expression filter collection data 
        List<Product> productList=new ArrayList<Product>();  
        productList.add(new Product(1,"Samsung A5",17000f));  
        productList.add(new Product(3,"Iphone 6S",65000f));
        productList.add(new Product(5,"Redmi4 ",26000f)); 

        // using lambda to filter data  
        Stream<Product> filtered_data = productList.stream().filter(p -> p.price > 20000f);  

        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );   
    }
}
