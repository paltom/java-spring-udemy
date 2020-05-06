package com.luv2code.springdemo;

public class CyclingCoach implements Coach {

    private FortuneService fortuneService;

    public CyclingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Ride 10 km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
