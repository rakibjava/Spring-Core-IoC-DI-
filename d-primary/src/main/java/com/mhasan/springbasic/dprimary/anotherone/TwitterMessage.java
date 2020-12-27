package com.mhasan.springbasic.dprimary.anotherone;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TwitterMessage implements MessagingInterface{
    @Override
    public String sendMsg() {
        return "Sending Message From Twitter";
    }
}
