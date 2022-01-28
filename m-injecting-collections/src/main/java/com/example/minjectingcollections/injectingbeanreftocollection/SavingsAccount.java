package com.example.minjectingcollections.injectingbeanreftocollection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("saving")
@Order (1)
public class SavingsAccount implements Account{

   @Override
   public String accountName () {
      return "savings";
   }

   @Override
   public String toString () {
      return "SavingsAccount{}";
   }
}
