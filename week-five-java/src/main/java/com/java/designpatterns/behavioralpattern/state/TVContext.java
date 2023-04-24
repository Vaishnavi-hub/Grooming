package com.java.designpatterns.behavioralpattern.state;

public class TVContext implements TVRemoteState{
    
    private TVRemoteState state;
    
    public TVRemoteState getState() {
        return state;
    }

    public void setState(TVRemoteState state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
