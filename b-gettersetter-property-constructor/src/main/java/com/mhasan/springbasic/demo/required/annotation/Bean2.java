package com.mhasan.springbasic.demo.required.annotation;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {

    public void doSomething(){
        System.out.println("Inside do doSomething() method of BeanTwo");
    }
}
