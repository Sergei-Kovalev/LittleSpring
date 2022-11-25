package ru.ngs.summerjob.LittleSpring.entity;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bark");
    }
}
