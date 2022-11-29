package ru.ngs.summerjob.aop.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Art of War")
    private String name;

    public String getName() {
        return name;
    }
}
