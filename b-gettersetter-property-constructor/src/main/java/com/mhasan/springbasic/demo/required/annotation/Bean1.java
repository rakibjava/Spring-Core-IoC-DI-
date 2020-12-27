package com.mhasan.springbasic.demo.required.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class Bean1 implements BeanPostProcessor {
    private Bean2 bean2;

    public Bean2 getBean2() {
        return bean2;
    }

   // @Required
    //without @Autowired will throw exception because @Required means
    //It applies to the bean setter method.
    // It indicates that the annotated bean must be populated at configuration time with the required property
   @Autowired
    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }

    public void doSomeThing(){
        System.out.println("Inside do doSomething() method of BeanOne");
        bean2.doSomething();
    }
}
