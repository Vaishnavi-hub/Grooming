package com.java.designpatterns.structuralpattern.adapter;

public class JpgImageViewer implements AdvancedImageViewer{

    @Override
    public void viewPng(String fileName) {}

    @Override
    public void viewJpg(String fileName) {
        System.out.println("Viewing Jpg Image file: "+ fileName);
    }
    
}
