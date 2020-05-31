package com.patterns.proxy;

public interface TwitterService {

    String getTimeline(String accountName);
    void postToTimeline(String accountName, String message);

}
