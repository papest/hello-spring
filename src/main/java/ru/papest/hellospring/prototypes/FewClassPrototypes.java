package ru.papest.hellospring.prototypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.papest.hellospring.services.ClassPrototypeService;
import ru.papest.hellospring.services.CollectionClassPrototypeService;

import java.util.List;
import java.util.stream.IntStream;

@Component
public class FewClassPrototypes {
    {
        System.out.println("Hello, I'm FewClassPrototypes!");
    }

    FewClassPrototypes(@Autowired ClassPrototypeService service, @Autowired CollectionClassPrototypeService collectionService, @Autowired ApplicationContext context, @Autowired AutowiredFields fields) {
        int few = 3;
        IntStream.range(0, few).forEach(i -> System.out.printf("Hello, new ClassPrototype %s !\n", service.getClassPrototype().intNumber));
        for (ClassPrototype classPrototype : collectionService.getPrototypeList(few)) {
            System.out.printf("Hello, new ClassPrototype %s from List!\n", classPrototype.intNumber);
        }
        IntStream.range(0, few).forEach(i -> System.out.printf("Hello, new %s !\n", context.getBean(ClassPrototype.class)));
        ((List<ClassPrototype>) context.getBean("classPrototypeList5"))
                .forEach(i -> System.out.printf("Hello, new %s from Bean classPrototypeList5!\n", i));
        ((List<ClassPrototype>) context.getBean("classPrototypeList5"))
                .forEach(i -> System.out.printf("Hello, new %s from Bean classPrototypeList5!\n", i));
        for (ClassPrototype classPrototype : collectionService.getPrototypeList(few)) {
            System.out.printf("Hello, new ClassPrototype %s from List!\n", classPrototype.intNumber);
        }
        fields.autowiredFields();
    }
}
