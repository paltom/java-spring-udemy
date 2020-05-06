package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

    public static void main(String[] args) {

        // read spring config file
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SportConfig.class)) {

            // get the bean from spring container
            Coach coach = applicationContext.getBean("tennisCoach", Coach.class);

            // call a method on the bean
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getDailyFortune());
        } catch (BeansException e) {
            // TODO: handle exception
        }
    }
}
