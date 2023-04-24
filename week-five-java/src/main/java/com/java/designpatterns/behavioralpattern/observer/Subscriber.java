package com.java.designpatterns.behavioralpattern.observer;

public interface Subscriber {

    // method used by Youtube Channel to notify Subscriber of any change
    public void update();

    //method to link Youtube channel to Subscriber
    public void setYoutubeChannel(YoutubeChannel channel);
}
