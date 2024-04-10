package ru.papest.hellospring.prototypes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Scope("prototype")
public class ClassPrototype {
    static AtomicInteger number = new AtomicInteger(0);
    int intNumber;

    ClassPrototype() {
        intNumber = number.incrementAndGet();
        System.out.printf("Hello, ClassPrototype %s instantiation!\n", intNumber);
    }
}
