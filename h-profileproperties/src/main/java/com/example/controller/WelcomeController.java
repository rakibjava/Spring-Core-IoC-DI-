package com.example.controller;

import com.example.config.ProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Value("${welcome.message}")
    private String welcomeMessage;

    private ProfileConfiguration profileConfiguration;

    @Autowired
    public WelcomeController(ProfileConfiguration profileConfiguration) {
        this.profileConfiguration = profileConfiguration;
    }

    @GetMapping("/welcome")
    public String welComeMessage(){
        return welcomeMessage;
    }
    @GetMapping("/welcome1")
    public String welComeMessage1(){
        return profileConfiguration.getUsername();
    }

}
