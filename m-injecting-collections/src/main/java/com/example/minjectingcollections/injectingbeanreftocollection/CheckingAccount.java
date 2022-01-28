package com.example.minjectingcollections.injectingbeanreftocollection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Qualifier("saving")
@Order(3)
public class CheckingAccount implements Account{
   @Override
   public String accountName () {
      return "checking";
   }

   @Override
   public String toString () {
      return "CheckingAccount{}";
   }
}
