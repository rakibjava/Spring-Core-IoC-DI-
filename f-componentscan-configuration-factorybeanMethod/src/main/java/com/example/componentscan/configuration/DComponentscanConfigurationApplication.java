package com.example.componentscan.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.componentscan.configuration","com.custompackage.config"})
public class DComponentscanConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DComponentscanConfigurationApplication.class, args);
		System.out.println(context.getBean("random"));
	}

}
