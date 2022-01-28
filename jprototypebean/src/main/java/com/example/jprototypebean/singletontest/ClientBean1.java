package com.example.jprototypebean.singletontest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientBean1 {
  private final ServiceBean serviceBean;

   @Autowired
   public ClientBean1 (ServiceBean serviceBean) {
      this.serviceBean = serviceBean;
   }

   public void doSomething(){
      System.out.println("from ClientBean1: serviceBean: "+System.identityHashCode(serviceBean));
  }

   public void testServieBeanFromClient1(String m){
      serviceBean.serviceBeanTest ( m );
   }
}