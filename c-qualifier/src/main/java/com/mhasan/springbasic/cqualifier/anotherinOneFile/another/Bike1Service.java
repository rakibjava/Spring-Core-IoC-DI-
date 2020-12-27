package com.mhasan.springbasic.cqualifier.anotherinOneFile.another;

import com.mhasan.springbasic.cqualifier.anotherExInOneFile.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bike1Service {
    Vehicle1 vehicle1;
    @Autowired
    public Bike1Service(@Qualifier("bike1") Vehicle1 vehicle1){
    this.vehicle1 = vehicle1;
    }
    public void getType(){
        System.out.println(vehicle1.typeOfVehicle());
    }
}
