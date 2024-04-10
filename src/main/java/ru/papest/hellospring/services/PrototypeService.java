package ru.papest.hellospring.services;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class PrototypeService {
    private String prototype;
    @Lookup
    public String getPrototype() {
        return null;
    }
}
