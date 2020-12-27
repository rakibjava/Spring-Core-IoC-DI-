package com.example.profile.eprofile.controller;

import com.example.profile.eprofile.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18Controller {
    private final GreetingService greetingService;

    public I18Controller(@Qualifier("I18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public void sayHello(){
        System.out.println(greetingService.sayGreeting());
    }
}
