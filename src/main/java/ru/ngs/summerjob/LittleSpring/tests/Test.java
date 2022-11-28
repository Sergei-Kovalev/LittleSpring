package ru.ngs.summerjob.LittleSpring.tests;

import ru.ngs.summerjob.LittleSpring.entity.Dog;
import ru.ngs.summerjob.LittleSpring.entity.Pet;

public class Test {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();
    }
}
