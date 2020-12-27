package com.mhasan.springbasic.dprimary.anotherone;

import org.springframework.stereotype.Component;

@Component
public class EmailMessage implements MessagingInterface{
    @Override
    public String sendMsg() {
        return "Sending message from Email";
    }
}
