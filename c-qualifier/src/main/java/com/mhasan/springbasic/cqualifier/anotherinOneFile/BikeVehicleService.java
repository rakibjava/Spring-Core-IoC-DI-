package com.mhasan.springbasic.cqualifier.anotherinOneFile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BikeVehicleService {
    private Vehicle vehicle;

    public BikeVehicleService(@Qualifier("bikeBean") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void service() {
        vehicle.start();
        vehicle.stop();
    }
}
