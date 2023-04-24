package com.java.designpatterns.structuralpattern.adapter;

public class ImageViewerAdapter implements ImageViewer{
    AdvancedImageViewer advancedImageViewer;

    public ImageViewerAdapter(String imageFormat){

        if(imageFormat.equalsIgnoreCase("png") ){
            advancedImageViewer = new PngImageViewer();			
        }else if (imageFormat.equalsIgnoreCase("jpg")){
            advancedImageViewer = new JpgImageViewer();
        }	
    }

    @Override
    public void view(String imageFormat, String fileName) {

        if(imageFormat.equalsIgnoreCase("png")){
            advancedImageViewer.viewPng(fileName);
        }
        else if(imageFormat.equalsIgnoreCase("jpg")){
            advancedImageViewer.viewJpg(fileName);
        }
    }
}
