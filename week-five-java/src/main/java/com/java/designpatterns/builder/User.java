package com.java.designpatterns.builder;

public class User {
    private String name;
    private int age;
    private String emailAddress;
    private String phoneNumber;

    // pass the builder class to the private constructor argument
    public User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
    }

    // create a static builder method which returns UserBuilder class object
    public static UserBuilder builder(){
        return new UserBuilder();
    }

    // generate get methods for all the fields of User class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
                + "]";
    }

    // create static inner builder class
    public static class UserBuilder{
        // create all the fields same as in User class
        private String name;
        private int age;
        private String emailAddress;
        private String phoneNumber;

        // generate get methods for all fields in User class with particular field as argument and return UserBuilder instance variable
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // create build method which create instance for User class and return it
        public User build(){
            return new User(this);
        } 
    }
}
