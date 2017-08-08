package com.mserpa.multiproject.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(value = {"com.mserpa.multiproject"})
public class ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }

}
