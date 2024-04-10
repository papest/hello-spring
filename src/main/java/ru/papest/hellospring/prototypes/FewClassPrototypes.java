package ru.papest.hellospring.prototypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.papest.hellospring.services.ClassPrototypeService;

import java.util.stream.IntStream;

@Component
public class FewClassPrototypes {
    {
        System.out.println("Hello, I'm FewClassPrototypes!");
    }

    FewClassPrototypes(@Autowired ClassPrototypeService service) {
        int few = 3;
        IntStream.range(0, few).forEach(i -> System.out.printf("Hello, new ClassPrototype %s !\n", service.getClassPrototype().intNumber));
    }
}
