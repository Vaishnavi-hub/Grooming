package com.java.designpatterns.creationalpattern.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // user created with all the fields of user class
        User user1 = User.builder().name("Arun Kumar").age(32).phoneNumber("9739738346").emailAddress("arunkumar@gmail.com").build();
        System.out.println(user1);

        // user created with few fields of user class
        User user2 = User.builder().name("Kavya T").emailAddress("kavya.t@gmail.com").build();
        System.out.println(user2);

        // user created with only one field of user class
        User user3 = User.builder().name("Anushya L").build();
        System.out.println(user3);
    }
}
