package com.mhasan.springbasic.cqualifier.anotherExInOneFile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Qualifier("car")
public class CarService implements Vehicle{
    @Override
    public String nameOfTheVehicle() {
        return "This is a from car ";
    }
}
