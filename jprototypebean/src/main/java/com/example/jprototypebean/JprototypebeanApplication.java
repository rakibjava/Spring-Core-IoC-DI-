package com.example.jprototypebean;

import com.example.jprototypebean.singletontest.ClientBean1;
import com.example.jprototypebean.singletontest.ClientBean2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = { "com.example" })
public class JprototypebeanApplication {

   public static void main (String[] args) {
      ApplicationContext context = SpringApplication.run ( JprototypebeanApplication.class, args );

      ClientBean1 bean1 = context.getBean ( ClientBean1.class );
      bean1.doSomething();
      bean1.testServieBeanFromClient1 ( "hello world" );

      ClientBean2 bean2 = context.getBean ( ClientBean2.class );
      bean2.doSomething();
      bean2.testServieBeanFromClient2 ( "hello world 2" );

      //System.out.println (context.getBean("beanp1test"));
   }

}
