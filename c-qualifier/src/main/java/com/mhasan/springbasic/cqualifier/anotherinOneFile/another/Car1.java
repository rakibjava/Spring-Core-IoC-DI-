package com.mhasan.springbasic.cqualifier.anotherinOneFile.another;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("car1")
public class Car1 implements Vehicle1{
    @Override
    public String typeOfVehicle() {
        return "From Car bro!";
    }
}
