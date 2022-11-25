package ru.ngs.summerjob.LittleSpring.entity;

public class Person {
    private final Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hi sweetie!");
        pet.say();
    }
}
