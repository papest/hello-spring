package ru.papest.hellospring.prototypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondPrototype {
    {
        System.out.println("It's SecondPrototype class");
    }

    @Autowired
    String prototype;

    SecondPrototype() {
        System.out.printf("Hello, %s ! Not nice example \n", prototype);

    }
}
