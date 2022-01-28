package com.example.jprototypebean.singletontest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceBean {

   public ServiceBean (){}

   public void serviceBeanTest (String message){
      System.out.println ("message from service bean "+ message);
   }
}