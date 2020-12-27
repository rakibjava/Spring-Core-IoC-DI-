package com.mhasan.springbasic.springcontext;


import com.mhasan.springbasic.springcontext.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mhasan.springbasic"})
public class SpringbasicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringbasicApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();
        System.out.println(ctx.getBean("bean1"));
        System.out.println(ctx.getBean("bean2"));
    }
}
