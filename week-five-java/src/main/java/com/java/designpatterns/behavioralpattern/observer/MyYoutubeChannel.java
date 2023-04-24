package com.java.designpatterns.behavioralpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyYoutubeChannel implements YoutubeChannel{

    private String channelName;
    private List<Subscriber> subscribers;
    private String videoTitle;
    private boolean isChanged;
    private final Object MUTEX = new Object();

    public MyYoutubeChannel(String name){
        this.channelName = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber sub) {
        if(sub == null) {
            throw new NullPointerException("Null Observer");
        }
		synchronized (MUTEX) {
            if(!subscribers.contains(sub)){
                subscribers.add(sub);
            }
		}
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        synchronized (MUTEX) {
            subscribers.remove(sub);
		}
    }

    @Override
    public void notifySubscribers() {
        List<Subscriber> subscriberLocal = null;
		synchronized (MUTEX) {
			if (!isChanged){
				return;
            }
			subscriberLocal = new ArrayList<>(this.subscribers);
			this.isChanged=false;
		}
		for (Subscriber sub : subscriberLocal) {
			sub.update();
		}

    }

    @Override
    public Object getUpdate(Subscriber sub) {
        return this.videoTitle;
    }
    
    // method to post video to the channel
    public void postVideo(String videoTitle){
        System.out.println("New video posted on " + channelName + " channel on topic: "+ videoTitle);
        this.videoTitle = videoTitle;
        this.isChanged = true;
        notifySubscribers();
    }
}
