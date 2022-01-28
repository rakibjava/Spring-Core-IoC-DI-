package com.example.minjectingcollections.injectingbeanreftocollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeanInjectionIntoCollections {

   final List<Account> accounts; // Injecting Account reference bean into collection

   @Autowired
   public BeanInjectionIntoCollections (@Qualifier("saving") List<Account> accounts) { // matching qualifier name "saving"
      this.accounts = accounts;
   }

   @Override
   public String toString () {
      return "BeanInjectionIntoCollections{" +
              "accounts=" + accounts +
              '}';
   }
}
