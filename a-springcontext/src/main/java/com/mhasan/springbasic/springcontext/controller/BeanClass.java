package com.mhasan.springbasic.springcontext.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanClass {

    @Bean("bean1")
    public String bean1(){
        return "from bean1";
    }

    @Bean("bean2")
    public String bean2(){
        return "from bean2";
    }
}
