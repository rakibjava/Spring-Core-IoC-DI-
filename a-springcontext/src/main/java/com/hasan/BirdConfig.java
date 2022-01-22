package com.hasan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BirdConfig {
  @Bean
  public String bird() {
    return "returned eagle";
  }
}