package com.example.jprototypebean.singletontest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientBean2 {

  @Autowired
  private ServiceBean serviceBean;


   public void doSomething(){
      System.out.println("from ClientBean2: serviceBean: "+System.identityHashCode(serviceBean));
  }

  public void testServieBeanFromClient2(String m){
      serviceBean.serviceBeanTest ( m );
  }
}