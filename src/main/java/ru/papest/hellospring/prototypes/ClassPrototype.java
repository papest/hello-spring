package ru.papest.hellospring.prototypes;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Scope("prototype")
public class ClassPrototype {
    static AtomicInteger number = new AtomicInteger(0);
    final int intNumber;

    ClassPrototype() {
        intNumber = number.incrementAndGet();
        System.out.printf("Hello, ClassPrototype %s instantiation!\n", intNumber);
    }

    @PostConstruct
    public void init() {
        System.out.printf("Hello, I'm ClassPrototype %s postConstruct method!\n", intNumber);
    }

    @Override
    public String toString() {
        return "ClassPrototype " + intNumber;
    }
}
