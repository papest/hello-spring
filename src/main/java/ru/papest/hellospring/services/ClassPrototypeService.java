package ru.papest.hellospring.services;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import ru.papest.hellospring.prototypes.ClassPrototype;

@Service
public class ClassPrototypeService {
    {
        System.out.println("It's ClassPrototypeService class");
    }

    private ClassPrototype classPrototype;

    @Lookup
    public ClassPrototype getClassPrototype() {
        return null;
    }

}
