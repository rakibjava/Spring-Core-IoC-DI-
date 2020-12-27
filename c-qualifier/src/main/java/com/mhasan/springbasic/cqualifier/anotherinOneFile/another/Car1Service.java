package com.mhasan.springbasic.cqualifier.anotherinOneFile.another;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car1Service {

    Vehicle1 vehicle1;
    @Autowired
    public Car1Service(@Qualifier("car1") Vehicle1 vehicle1){
        this.vehicle1 = vehicle1;
    }
    public void getType(){
        System.out.println(vehicle1.typeOfVehicle());;
    }
}
