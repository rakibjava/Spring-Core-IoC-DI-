package com.mhasan.springbasic.cqualifier.anotherinOneFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

   @Autowired
   @Qualifier("carBean")
   private Vehicle vehicle;

   public void service() {
      vehicle.start();
      vehicle.stop();
   }
}