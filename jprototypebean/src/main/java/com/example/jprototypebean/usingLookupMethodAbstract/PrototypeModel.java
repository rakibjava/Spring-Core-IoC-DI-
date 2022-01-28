package com.example.jprototypebean.usingLookupMethodAbstract;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeModel {
   private String name;

   public PrototypeModel () {
      System.out.println ("Default Constructor");
   }

   public PrototypeModel (String name) {
      System.out.println ("parameterized Constructor");
      this.name = name;
   }

   public String getName () {
      return name;
   }

   public void setName (String name) {
      this.name = name;
   }

   public String action(){
      return name;
   }
}
