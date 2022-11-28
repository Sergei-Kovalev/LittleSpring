package ru.ngs.summerjob.LittleSpring.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog.class constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class dog: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class dog: destroy method");
    }

/*

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/

    @Override
    public void say() {
        System.out.println("Bark");
    }
}
