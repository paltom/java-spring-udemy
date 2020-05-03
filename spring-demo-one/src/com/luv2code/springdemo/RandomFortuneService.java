package com.luv2code.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private List<String> fortunes = Arrays.asList("Random fortune 1", "Random fortune 2", "Random fortune 3");

    @Override
    public String getFortune() {
        return fortunes.get(new Random().nextInt(fortunes.size()));
    }

}
