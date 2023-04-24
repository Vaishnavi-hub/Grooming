package com.java.designpatterns.behavioralpattern.state;

public class TestTVRemoteState {
    public static void main(String[] args) {
        TVContext context = new TVContext();

        TVRemoteState tvOnState = new TVOnState();
        TVRemoteState tvOffState = new TVOffState();

        context.setState(tvOnState);
        context.doAction();

        context.setState(tvOffState);
        context.doAction();
    }
}
