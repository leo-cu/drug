package com.example.drug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.drug")
public class DrugApplication {
    public static void main(String[] args) {
        SpringApplication.run(DrugApplication.class, args);
    }

}
