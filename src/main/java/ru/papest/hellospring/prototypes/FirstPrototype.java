package ru.papest.hellospring.prototypes;

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
}
