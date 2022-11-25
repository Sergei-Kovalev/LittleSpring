package ru.ngs.summerjob.LittleSpring.entity;

public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog.class constructor");
    }

    public void init() {
        System.out.println("Class dog: init method");
    }

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
