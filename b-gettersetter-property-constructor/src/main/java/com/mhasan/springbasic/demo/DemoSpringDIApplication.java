package com.mhasan.springbasic.demo;


import com.mhasan.springbasic.demo.controller.ConstructorInjectedController;
import com.mhasan.springbasic.demo.controller.GetterInjectedController;
import com.mhasan.springbasic.demo.controller.PropertyInjectedController;
import com.mhasan.springbasic.demo.required.annotation.Bean1;
import com.mhasan.springbasic.demo.required.annotation2.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class DemoSpringDIApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(DemoSpringDIApplication.class, args);
		System.out.println("==Dependency Injection using @Autowired on gettersetter/property/constructor==");
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		System.out.println("==Dependency Injection using @Required on gettersetter==");

		//Bean1 bean1 = ctx.getBean(Bean1.class);
		//bean1.doSomeThing();

		//System.out.println("== Another Dependency Injection using @Required on gettersetter==");
		//Capital capital =ctx.getBean(Capital.class);
		//capital.setCapitalName("Dhaka");
		//Country country =ctx.getBean(Country.class);
		//country.setCountryName("Bangladesh");
		//country.setCapital(capital);
		//System.out.println(country.getCountryName() +" = "+country.getCapital().getCapitalName());
		//System.out.println(country.getCountryName());

		//Student student = (Student) ctx.getBean("student");
		//System.out.println(student.getAge());
		//System.out.println(student.getName());

	}

}
