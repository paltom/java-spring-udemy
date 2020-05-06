package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

    @Value("${fortunes.file}") Path file;
    private List<String> fortunes;

    private Random random = new Random();

    @PostConstruct
    public void init() {
        fortunes = readFortunesFile(file);
    }

    private List<String> readFortunesFile(Path file) {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Cannot read fortunes file " + file.toAbsolutePath().toString() + ": " + e.getMessage());
        }
        return List.of("");
    }

    @Override
    public String getFortune() {
        return fortunes.get(random.nextInt(fortunes.size()));
    }

}
