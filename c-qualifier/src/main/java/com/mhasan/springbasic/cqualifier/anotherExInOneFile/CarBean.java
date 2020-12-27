package com.mhasan.springbasic.cqualifier.anotherExInOneFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarBean {
    private Vehicle vehicle;

    @Autowired
    public CarBean(@Qualifier("car")Vehicle vehicle){
       this.vehicle=vehicle;
   }

    @Bean("toyota")
    public String printCar(){
        return vehicle.nameOfTheVehicle();
    }
}
