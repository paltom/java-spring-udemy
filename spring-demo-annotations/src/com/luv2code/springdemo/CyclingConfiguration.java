package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclingConfiguration {
    
    @Bean
    public FortuneService singleFortuneService() {
        return new SingleFortuneService();
    }

    @Bean
    public Coach cyclingCoach() {
        return new CyclingCoach(singleFortuneService());
    }
}
