package com.startingwithspring.StartingWithSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class StartingWithSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartingWithSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext apctx) {
        return args -> {
            System.out.println("Beans provided by Spring Boot : ");
            String[] beanNames = apctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String name :
                    beanNames) {
                System.out.println("@Bean " + name);
            }
        };
    }
}
