package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Coach theCoach = applicationContext.getBean("tennisCoach", Coach.class);
            Coach alphaCoach = applicationContext.getBean("tennisCoach", Coach.class);

            boolean result = (theCoach == alphaCoach);

            System.out.println("Pointing to the same object: " + result);
            System.out.println("Memory location for theCoach: " + theCoach);
            System.out.println("Memory location for alphaCoach: " + alphaCoach);
        } catch (BeansException e) {
        }
    }
    
}
