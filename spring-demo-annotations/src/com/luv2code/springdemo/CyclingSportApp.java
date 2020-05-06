package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclingSportApp {
    
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclingConfiguration.class)) {
            
            Coach coach = applicationContext.getBean("cyclingCoach", Coach.class);

            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getDailyFortune());
        } catch (BeansException e) {
            //TODO: handle exception
        }
    }
}
