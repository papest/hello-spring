package ru.papest.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.papest.hellospring.prototypes.ClassPrototype;
import ru.papest.hellospring.services.CollectionClassPrototypeService;

import java.util.List;

@Configuration
public class SecondConfig {
    @Autowired
    CollectionClassPrototypeService service;
    @Bean()
    List<ClassPrototype> classPrototypeList5() {
        return service.getPrototypeList(5);
    }
}
