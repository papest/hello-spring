package ru.papest.hellospring.prototypes;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstPrototype {
    {
        System.out.println("It's FirstPrototype class");
    }
    FirstPrototype(@Autowired String prototype) {

        System.out.printf("Hello, %s !\n", prototype);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Hello, I'm FirstPrototype preDestroy method!");
    }
}
