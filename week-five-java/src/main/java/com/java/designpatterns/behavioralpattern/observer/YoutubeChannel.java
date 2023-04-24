package com.java.designpatterns.behavioralpattern.observer;

public interface YoutubeChannel {
    
    // methods to subscribe and unsubscribe
    public void subscribe(Subscriber sub);
    public void unsubscribe(Subscriber sub);

    // method to notify Subscribers
    public void notifySubscribers();

    // method to get updates from Youtube Channel
    public Object getUpdate(Subscriber sub);
}
