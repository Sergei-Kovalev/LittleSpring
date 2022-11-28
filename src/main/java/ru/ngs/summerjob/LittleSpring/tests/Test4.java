package ru.ngs.summerjob.LittleSpring.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.LittleSpring.entity.Dog;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext2.xml");
/*
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());



        System.out.println("Variables refer to the same object? : " + (myDog == yourDog));
        context.close();
*/
    }
}
