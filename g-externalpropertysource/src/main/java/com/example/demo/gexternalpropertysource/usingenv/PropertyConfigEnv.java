package com.example.demo.gexternalpropertysource.usingenv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfigEnv {
    @Autowired
    Environment environment;

    @Bean
    public AnotherDataSource anotherDataSource(){
        AnotherDataSource dataSource = new AnotherDataSource();
        dataSource.setUser(environment.getProperty("username1"));
        dataSource.setPassword(environment.getProperty("password1"));
        dataSource.setUrl(environment.getProperty("password1"));
        return dataSource;
    }
}