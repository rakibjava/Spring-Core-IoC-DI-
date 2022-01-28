package com.example.jprototypebean.usingLookupMethod;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component ("prototypeBean")
@Scope (ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyPrototypeBean {

   private String name;
   private int age;
   private String dateTimeString = LocalDateTime.now ().toString ();

   public MyPrototypeBean () {
      System.out.println ( "testing prototype default constructor...." );
   }

   public MyPrototypeBean (String name, int age) {
      System.out.println ( "testing prototype...." );
      this.name = name;
      this.age = age;
   }

   public String getDateTime () {
      return dateTimeString;
   }


   public String getNameAge () {
      return name + " " + age;
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