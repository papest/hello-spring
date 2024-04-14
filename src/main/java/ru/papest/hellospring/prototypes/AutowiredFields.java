package ru.papest.hellospring.prototypes;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.papest.hellospring.services.CollectionClassPrototypeService;
import ru.papest.hellospring.services.PrototypeService;

import java.util.List;

@Component
public class AutowiredFields {
    @Autowired
    ClassPrototype classPrototype;
    @Autowired
    PrototypeService prototypeService;
    @Autowired
    CollectionClassPrototypeService collectionClassPrototypeService;
    @Autowired
    List<ClassPrototype> list;
    @Autowired
    ApplicationContext context;

    {
        System.out.println("It's AutowiredFields class");
    }

    AutowiredFields autowiredFields() {
        System.out.printf("Hello,%s !\n", classPrototype);
        System.out.printf("Hello,%s !\n", prototypeService);
        System.out.printf("Hello,%s !\n", list);
        System.out.printf("Hello,%s !\n", context);
        System.out.printf("Hello,%s !\n", collectionClassPrototypeService);
        list.forEach(i -> System.out.printf("Hello, %s !\n", i));
        return this;
    }

    @PostConstruct
    void helloFromPostConstruct() {
        System.out.printf("Hello,%s from AutowiredFields PostConstruct!\n", classPrototype);
        System.out.printf("Hello,%s from AutowiredFields PostConstruct!\n", prototypeService);
        System.out.printf("Hello,%s from AutowiredFields PostConstruct!\n", list);
        System.out.printf("Hello,%s from AutowiredFields PostConstruct!\n", context);
        System.out.printf("Hello,%s from AutowiredFields PostConstruct!\n", collectionClassPrototypeService);
        list.forEach(i -> System.out.printf("Hello, %s from AutowiredFields PostConstruct!\n", i));
    }
}

