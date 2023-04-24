package com.java.designpatterns.structuralpattern.adapter;

public class GalleryApp implements ImageViewer{
    ImageViewerAdapter imageViewerAdapter; 

   @Override
   public void view(String imageFormat, String fileName) {
       
      //inbuilt support to show jpeg image files
      if(imageFormat.equalsIgnoreCase("jpeg")){
         System.out.println("Viewing jpeg file: " + fileName);			
      } 
      //imageAdapter is providing support to show other file formats
      else if(imageFormat.equalsIgnoreCase("png") || imageFormat.equalsIgnoreCase("jpg")){
         imageViewerAdapter = new ImageViewerAdapter(imageFormat);
         imageViewerAdapter.view(imageFormat, fileName);
      }
      else{
         System.out.println("Invalid image. " + imageFormat + " format not supported");
      }
   }
}
