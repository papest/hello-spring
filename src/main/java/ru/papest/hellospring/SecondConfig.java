package ru.papest.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.papest.hellospring.prototypes.ClassPrototype;
import ru.papest.hellospring.services.CollectionClassPrototypeService;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SecondConfig {
    @Autowired
    CollectionClassPrototypeService service;
    @Bean()
    List<ClassPrototype> classPrototypeList5() {
        return service.getPrototypeList(5);
    }
    @Bean("list3")
    List<ClassPrototype> classPrototypeList3() {
        return service.getPrototypeList(3);
    }
    @Bean()
    ArrayList<ClassPrototype> classPrototypeList() {
        return new ArrayList<>(service.getPrototypeList(4));
    }
    @ClassPrototypeList2
    @Bean()
    List<ClassPrototype> classPrototypeList2() {
        return service.getPrototypeList(2);
    }

}
