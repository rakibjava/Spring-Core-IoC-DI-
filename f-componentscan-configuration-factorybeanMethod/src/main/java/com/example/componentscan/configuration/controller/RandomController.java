package com.example.componentscan.configuration.controller;

import com.example.componentscan.configuration.service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RandomController {
    RandomService randomService;

    @Autowired
    public RandomController(RandomService randomService) {
        this.randomService = randomService;
    }

    public int returnRandomNumber(){
        return randomService.getRandomNum();
    }
}

