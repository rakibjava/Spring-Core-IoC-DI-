package com.mhasan.springbasic.dprimary;

import com.mhasan.springbasic.dprimary.anotherone.MessagingInterface;
import com.mhasan.springbasic.dprimary.contoller.ConstructorInjectedController;
import com.mhasan.springbasic.dprimary.contoller.GetterInjectedController;
import com.mhasan.springbasic.dprimary.contoller.PropertyInjectedController;
import com.mhasan.springbasic.dprimary.service.ConstructorGreetingService;
import com.mhasan.springbasic.dprimary.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DPrimaryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DPrimaryApplication.class, args);
		System.out.println("Dependency Injection using primary" +
				" @Primary to give higher preference to a bean when there are multiple beans of the same type.");
		// there are three bean in the service package annotated with @service where all three beans are same type
		// means all three beans are implmented the same interface call GreetingService.
		// now if we called the bean like below without annotating @primary or @ qualifier the it will thorw exception
		// beacuse spring container does not know which bean to inject.
		// In this example we used @primary to ConstructorInjectedController.class so spring will give preferece and
		// inject ConstructorGreetingService.class

		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		GreetingService greetingService = ctx.getBean(GreetingService.class);
		// there are three beans but in ConstructorGreetingService used @Primary so it will inject ConstructorGreetingService
		System.out.println(greetingService.sayGreeting());

		System.out.println("====Another one=====");
		MessagingInterface messagingInterface =ctx.getBean(MessagingInterface.class);
		// there are three beans but in TwitterMessage.class used @Primary
		// so it will give reference and inject TwitterMessage.class and return twitter message
		System.out.println(messagingInterface.sendMsg());


	}

}
