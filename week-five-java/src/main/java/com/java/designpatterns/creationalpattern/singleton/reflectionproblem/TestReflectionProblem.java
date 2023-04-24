package com.java.designpatterns.creationalpattern.singleton.reflectionproblem;

import java.lang.reflect.Constructor;

public class TestReflectionProblem {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;

        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (Singleton) constructor.newInstance();
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println(instance1 == instance2);


    }
}
