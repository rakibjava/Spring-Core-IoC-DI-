package com.mhasan.springbasic.cqualifier;

import com.mhasan.springbasic.cqualifier.anotherExInOneFile.Vehicle;
import com.mhasan.springbasic.cqualifier.anotherinOneFile.Bike;
import com.mhasan.springbasic.cqualifier.anotherinOneFile.Car;
import com.mhasan.springbasic.cqualifier.anotherinOneFile.VehicleService;
import com.mhasan.springbasic.cqualifier.anotherinOneFile.another.Bike1;
import com.mhasan.springbasic.cqualifier.anotherinOneFile.another.Bike1Service;
import com.mhasan.springbasic.cqualifier.anotherinOneFile.another.Car1;
import com.mhasan.springbasic.cqualifier.anotherinOneFile.another.Car1Service;
import com.mhasan.springbasic.cqualifier.controller.ConstructorInjectedController;
import com.mhasan.springbasic.cqualifier.controller.GetterInjectedController;
import com.mhasan.springbasic.cqualifier.controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CQualifierApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CQualifierApplication.class, args);
		System.out.println("====Dependency Injection using qualifier====");
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		System.out.println("====Another Dependency Injection using qualifier====");
		System.out.println(ctx.getBean("toyota"));
		System.out.println(ctx.getBean("harleyDevison"));

		System.out.println("====Another Dependency Injection using qualifier====");
		VehicleService vehicle = ctx.getBean(VehicleService.class);
		vehicle.service();

		System.out.println("====Another Dependency Injection using qualifier====");
		ctx.getBean(Bike1Service.class).getType();
		ctx.getBean(Car1Service.class).getType();



	}

}
