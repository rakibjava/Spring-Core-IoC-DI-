package com.example.profile.eprofile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("I18nService")
public class SpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "From Spanish Greeting";
    }
}
