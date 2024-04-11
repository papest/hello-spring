package ru.papest.hellospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.papest.hellospring.prototypes.ClassPrototype;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class CollectionClassPrototypeService {

    @Autowired ClassPrototypeService service;



    public List<ClassPrototype> getPrototypeList(int size) {
        return IntStream.range(0, size).mapToObj(i -> service.getClassPrototype()).collect(Collectors.toList());
    }
}
