package com.mhasan.springbasic.cqualifier.anotherExInOneFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BikeBean {

    private Vehicle vehicle;

    @Autowired
    public BikeBean(@Qualifier("bike")Vehicle vehicle){
        this.vehicle=vehicle;
    }

    @Bean("harleyDevison")
    public String printCar(){
        return vehicle.nameOfTheVehicle();
    }
}
