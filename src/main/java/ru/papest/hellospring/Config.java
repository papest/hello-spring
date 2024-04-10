package ru.papest.hellospring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    public String singleton() {
        System.out.println("Hello! I am Singleton Bean initialisation!");
        return "Singleton";
    }

    Integer number = 0;

    @Bean()
    @Primary
    @Scope("prototype")
    public String prototype() {
        number++;
        System.out.printf("Hello! I am Prototype Bean %s  initialisation!\n", number);
        return "Prototype " + number;
    }
}
