package com.mhasan.springbasic.dprimary.anotherone;

import org.springframework.stereotype.Component;

@Component
public class FacebookMessage implements MessagingInterface{
    @Override
    public String sendMsg() {
        return "Sending message from Facebook";
    }
}
