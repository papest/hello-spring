package ru.papest.hellospring.prototypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FistClassPrototype {
    {
        System.out.println("It's FirstClassPrototype class");
    }

    FistClassPrototype(@Autowired ClassPrototype classPrototype) {
        System.out.printf("Hello,ClassPrototype  %s !\n", classPrototype.intNumber);
    }
}
