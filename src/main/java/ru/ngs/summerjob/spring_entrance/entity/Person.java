package ru.ngs.summerjob.spring_entrance.entity;

import org.springframework.beans.factory.annotation.Value;

//@Component("person")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Class Person created");
    }
//
//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    //    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Pet set in class Person");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callPet() {
        System.out.println("Hi sweetie!");
        pet.say();
    }
}
