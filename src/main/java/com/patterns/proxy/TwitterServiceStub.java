package com.patterns.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String accountName) {
        return "this is the timeline from stub";
    }

    @Override
    public void postToTimeline(String accountName, String message) {
        System.out.println("Posting \"" + message + "\" to \"" + accountName + "'s\" twitter timeline");
    }
}
