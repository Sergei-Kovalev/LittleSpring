package ru.ngs.summerjob.LittleSpring.entity;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
