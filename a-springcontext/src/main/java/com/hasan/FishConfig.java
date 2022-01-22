package com.hasan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FishConfig {
  @Bean()
  public String fish() {
    return "returned goldfish";
  }
  

}