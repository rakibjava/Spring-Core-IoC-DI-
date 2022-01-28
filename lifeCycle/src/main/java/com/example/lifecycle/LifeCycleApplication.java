package com.example.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LifeCycleApplication {

   public static void main (String[] args) {
      ApplicationContext context = SpringApplication.run ( LifeCycleApplication.class, args );

      PostConAndPreDestroyBean postConBean = context.getBean ( "postPreBean", PostConAndPreDestroyBean.class );
      postConBean.getSomething ();

      InitAndDestroyMethodBean initBean = context.getBean ( "initAndDestroyBean" , InitAndDestroyMethodBean.class);
      initBean.getSomething ();

      System.out.println ( "-- finished --" );
   }

   // Use @PostConstruct and @PreDestroy in the class
   @Bean
   public PostConAndPreDestroyBean postPreBean () {
      return new PostConAndPreDestroyBean ();
   }

   // define init and destroy method at the bean creating
   @Bean (initMethod = "testInitMethod", destroyMethod = "testDestroyMethod")
   public InitAndDestroyMethodBean initAndDestroyBean () {
      return new InitAndDestroyMethodBean ();
   }
}
