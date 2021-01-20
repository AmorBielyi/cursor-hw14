package com.romanbielyi.hw14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Hw14Application {
    public static void main(String[] args) {
        SpringApplication.run(Hw14Application.class, args);
    }
}
