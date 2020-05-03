package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KarateCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Break 50 wooden planks with your bare hands";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
    
}
