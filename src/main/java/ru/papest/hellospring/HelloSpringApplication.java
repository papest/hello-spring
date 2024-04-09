package ru.papest.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
    static {
        System.out.println("Hello, Spring Application! Static block");
    }

    {
        System.out.println("Hello, Spring Application! Instance block");
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

}
