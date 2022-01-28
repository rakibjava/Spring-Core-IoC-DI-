package com.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PostConAndPreDestroyBean {

   @PostConstruct
   public void postConstructMethod(){
      System.out.println ("printing from @PostConstruct");
   }

   @PreDestroy
   public void preDestroyMethod(){
      System.out.println ("printing from @PreDestroy");
   }

   public void getSomething(){
      System.out.println ("Return something by method call");
   }
}
