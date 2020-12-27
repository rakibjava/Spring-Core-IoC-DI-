package com.example.componentscan.configuration.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomService implements RandomNumberGenerator{
    @Override
    public int getRandomNum() {
        Random random = new Random();
        int randomWithNextInt = random.nextInt();
        return randomWithNextInt;
    }
}
