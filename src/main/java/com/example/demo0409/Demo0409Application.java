package com.example.demo0409;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"Controller"})
public class Demo0409Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0409Application.class, args);
    }

}
