package com.example.jprototypebean.usingObjectprovider;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // if singleton then value will not initialize
public class BeanProtoType {
   private String name;

   private int age;
   public BeanProtoType (){}

   public BeanProtoType (String name, int age){
      this.name = name;
      this.age = age;
   }

   public String getName () {
      return name;
   }

   public void setName (String name) {
      this.name = name;
   }

   public int getAge () {
      return age;
   }

   public void setAge (int age) {
      this.age = age;
   }
}
