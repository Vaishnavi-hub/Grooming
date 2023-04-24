package com.java.designpatterns.behavioralpattern.observer;

public class MyYoutubeChannelSubscriber implements Subscriber{

    private String name;
    private YoutubeChannel channel;

    public MyYoutubeChannelSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String video = (String) channel.getUpdate(this);
		if(video == null){
			System.out.println("Notification for " + name + ":: No new video posted");
		}else
		System.out.println("Notification for " + name + ":: New video posted on "+ video);
    }

    @Override
    public void setYoutubeChannel(YoutubeChannel channel) {
        this.channel = channel;
    }
    
}
