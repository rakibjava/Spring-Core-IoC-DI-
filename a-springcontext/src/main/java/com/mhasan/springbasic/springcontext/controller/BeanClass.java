package com.mhasan.springbasic.springcontext.controller;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BeanClass {

    //@Bean(value = "bean1",autowire = Autowire.BY_NAME,initMethod = "",destroyMethod = "",autowireCandidate = false )
    @Bean
    public String bean1(){
        return "from bean1";
    }

    @Bean("bean2")
    @SessionScope
    public String bean2(){
        return "from bean2";
    }
}
