package ru.papest.hellospring.prototypes;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import ru.papest.hellospring.Config;
import ru.papest.hellospring.services.PrototypeService;

import java.util.stream.IntStream;

@Component
public class FewPrototypes {
    {
        System.out.println("Hello, I'm FewPrototypes!");
    }

    FewPrototypes(@Autowired ApplicationContext context, @Autowired PrototypeService service) {
        int few = 4;
        var anotherContext = new AnnotationConfigApplicationContext(Config.class);
        IntStream.range(0, few).forEach(i -> System.out.printf("Hello, new %s !\n", anotherContext.getBean("prototype")));
        System.out.println("Look! It's another contest!");
        System.out.println("And this is our context");
        IntStream.range(0, few).forEach(i -> System.out.printf("Hello, new %s !\n", context.getBean("prototype")));
        IntStream.range(0, few).forEach(i -> System.out.printf("Hello, new %s !\n", service.getPrototype()));

    }
}
