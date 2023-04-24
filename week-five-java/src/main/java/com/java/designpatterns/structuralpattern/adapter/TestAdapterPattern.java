package com.java.designpatterns.structuralpattern.adapter;

public class TestAdapterPattern {
    public static void main(String[] args) {
        GalleryApp gallery = new GalleryApp();

        gallery.view("jpeg", "naruto.jpeg");
        gallery.view("png", "sasuke.png");
        gallery.view("jpg", "jiraya.jpg");
        gallery.view("gif", "sakura.gif");
    }
}
