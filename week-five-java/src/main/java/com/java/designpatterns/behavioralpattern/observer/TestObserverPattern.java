package com.java.designpatterns.behavioralpattern.observer;

public class TestObserverPattern {
    public static void main(String[] args) {

        // create Youtube channel
        MyYoutubeChannel channel = new MyYoutubeChannel("Tech Knowledge");

        // create Subscribers
        Subscriber sub1 = new MyYoutubeChannelSubscriber("Ramya");
        Subscriber sub2 = new MyYoutubeChannelSubscriber("Varshine");
        Subscriber sub3 = new MyYoutubeChannelSubscriber("Hashini");

        // Subscribers subscribe the channel
        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.subscribe(sub3);

        // Link Subscriber to Channel
        sub1.setYoutubeChannel(channel);
        sub2.setYoutubeChannel(channel);
        sub3.setYoutubeChannel(channel);

        //check if any update/notification available
        sub1.update();

        // post video to channel
        channel.postVideo("Java Tutorial Part 1");
    }
}
