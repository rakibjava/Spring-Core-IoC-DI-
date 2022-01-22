package com.mhasan.springbasic.springcontext;


import com.hasan.BeanCollection;
import com.mhasan.springbasic.springcontext.controller.BeanImport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.hasan"})
@Import({BeanCollection.class})
public class SpringbasicApplication {


    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringbasicApplication.class, args);
        //MyController controller = (MyController) ctx.getBean("myController");
       // controller.hello();
        System.out.println(ctx.getBean("bean1"));
        System.out.println(ctx.getBean("bean2"));

        BeanImport beanImport = ctx.getBean(BeanImport.class);


        // the following bean will come from @Import annotation
        System.out.println(ctx.getBean("bird"));
        System.out.println(ctx.getBean("fish"));



    }
}
