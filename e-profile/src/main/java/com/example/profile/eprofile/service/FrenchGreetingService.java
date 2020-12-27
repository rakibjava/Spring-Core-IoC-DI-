package com.example.profile.eprofile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FN")
@Service("I18nService")
public class FrenchGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "From French Greeting";
    }
}
