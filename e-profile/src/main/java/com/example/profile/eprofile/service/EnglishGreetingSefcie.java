package com.example.profile.eprofile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class EnglishGreetingSefcie implements GreetingService{
    @Override
    public String sayGreeting() {
        return "From English Greeting";
    }
}
