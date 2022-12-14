package ru.ngs.summerjob.spring_entrance.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.spring_entrance.entity.Dog;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }
}
