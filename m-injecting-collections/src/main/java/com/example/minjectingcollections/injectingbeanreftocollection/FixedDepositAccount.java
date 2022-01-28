package com.example.minjectingcollections.injectingbeanreftocollection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("fixed")
@Order (2)
public class FixedDepositAccount implements Account{
   @Override
   public String accountName () {
      return "fixed";
   }

   @Override
   public String toString () {
      return "FixedDepositAccount{}";
   }
}
