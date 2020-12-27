package com.custompackage.config;

import com.example.componentscan.configuration.controller.RandomController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfig {
    @Autowired
    RandomController randomController;

    @Bean("random")
    public int printRandonNum(){
        return randomController.returnRandomNumber();
    }
}
