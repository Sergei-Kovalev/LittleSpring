package ru.ngs.summerjob.spring_entrance.tests;

import ru.ngs.summerjob.spring_entrance.entity.Dog;
import ru.ngs.summerjob.spring_entrance.entity.Pet;

public class Test {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();
    }
}
