package com.mhasan.springbasic.cqualifier.anotherinOneFile.another;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bike1")
public class Bike1 implements Vehicle1{
    @Override
    public String typeOfVehicle() {
        return "From Bike Bro";
    }
}
