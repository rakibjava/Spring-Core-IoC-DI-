package com.example.profile.eprofile;

import com.example.profile.eprofile.controller.I18Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EProfileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(EProfileApplication.class, args);
		I18Controller i18Controller =(I18Controller)ctx.getBean("i18Controller");
		i18Controller.sayHello();

	}

}
