package com.java.accessmodifiers;

class Base{
    int num = 10;
    public String str = "Hello";
    protected double val = 10.5;
    private char ch = 'j';
    
    void defaultDisplay(){
        System.out.println("\nDisplay method with default access level");
    }

    public void updatevalues(int newNum, String newStr, char newCh, double newVal){
        num = newNum;
        str = newStr;
        ch = newCh;
        val = newVal;
        System.out.println("\nPublic Method\n" + "Default Field: "+ num + " Public Field: " + str + " Protected Field: " + val + " Private Field: " + ch);
    }

    private void updateNum(int newNum){
        num = newNum;
        System.out.println(num);
    }

    protected void pretectedDisplay(String value){
        System.out.println("\n" + value);
    }

}

class Derived extends Base {

    public static void main(String[] args) {
        // Object creation for subclass
        Base base = new Base();

        // Access base class fields from derived class
        System.out.println("Access Level of Fields");
        System.out.println("Default Field: " + base.num);
        System.out.println("Public Field: " + base.str);
        System.out.println("Protected Field: " + base.val);
        // System.out.println("Private Field: " + base.ch); // can't access private method from subclass

        // Access base class methods from derived class
        base.defaultDisplay();
        base.updatevalues(5, "Welcome", 's', 9.356);
        base.pretectedDisplay("Protected Method");
        // base.updateNum(87); // can't access private method from subclass
    }
}

