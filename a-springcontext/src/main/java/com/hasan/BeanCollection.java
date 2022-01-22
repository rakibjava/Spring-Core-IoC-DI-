package com.hasan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BirdConfig.class, FishConfig.class})
public class BeanCollection {

    @Bean ("dogConfig")
    public String getDog() {
        return "returned goldfish";
    }
}
