package com.example.minjectingcollections;

import com.example.minjectingcollections.injectingbeanreftocollection.Account;
import com.example.minjectingcollections.simplecollections.SimpleInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;

import java.util.List;

@SpringBootApplication
public class MInjectingCollectionsApplication {



   public static void main (String[] args) {
      ApplicationContext ctx= SpringApplication.run ( MInjectingCollectionsApplication.class, args );
      SimpleInject simpleInject = ctx.getBean ( "simpleInject", SimpleInject.class );
      System.out.println (simpleInject.getList ());
      System.out.println (simpleInject.getSet ());
      System.out.println (simpleInject.getMap ());

      System.out.println ("Inject all bean which created from Account Interface: "+ ctx.getBean ( "beanInjectionIntoCollections" ));

   }

}
