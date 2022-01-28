package com.example.lifecycle;

public class InitAndDestroyMethodBean {

   public InitAndDestroyMethodBean () {
      System.out.println ("from default constructor: testing init and destroy method bean");
   }

   public void testInitMethod(){
      System.out.println ("printing from initMethod");
   }


   public void testDestroyMethod(){
      System.out.println ("printing from destroyMethod");
   }
   public void getSomething(){
      System.out.println ("Return something by method call");
   }
}
