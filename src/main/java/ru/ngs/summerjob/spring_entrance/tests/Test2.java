package ru.ngs.summerjob.spring_entrance.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.spring_entrance.entity.Pet;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
