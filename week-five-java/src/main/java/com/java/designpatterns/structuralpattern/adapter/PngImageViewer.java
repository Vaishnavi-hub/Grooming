package com.java.designpatterns.structuralpattern.adapter;

public class PngImageViewer implements AdvancedImageViewer{

    @Override
    public void viewPng(String fileName) {
        System.out.println("Viewing Png Image file: "+ fileName);
    }

    @Override
    public void viewJpg(String fileName) {}
}
