package ru.papest.hellospring.prototypes;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.papest.hellospring.ClassPrototypeList2;
import ru.papest.hellospring.services.CollectionClassPrototypeService;
import ru.papest.hellospring.services.PrototypeService;

import java.util.ArrayList;
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
    ArrayList<ClassPrototype> list1;
    @Autowired
    @Qualifier("list3")
    List<ClassPrototype> list3;
    @Autowired
    @ClassPrototypeList2
    List<ClassPrototype> list2;
    @Autowired
    ApplicationContext context;

    {
        System.out.println("It's AutowiredFields class");
    }

    AutowiredFields autowiredFields() {
        System.out.println("It's autowiredFields method");
        System.out.printf("Hello,%s !\n", classPrototype);
        System.out.printf("Hello,%s !\n", prototypeService);
        System.out.printf("Hello,%s !\n", list);
        System.out.printf("Hello,autowired Arraylist %s !\n", list1);
        System.out.printf("Hello,list3 %s !\n", list3);
        System.out.printf("Hello,%s !\n", context);
        System.out.printf("Hello,%s !\n", collectionClassPrototypeService);
        System.out.printf("Hello,@ClassPrototypeList2 %s !\n", list2);

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

    @PostConstruct
    void secondPostConstruct() {
        System.out.println("Hello from AutowiredFields secondPostConstruct !");
    }
}
