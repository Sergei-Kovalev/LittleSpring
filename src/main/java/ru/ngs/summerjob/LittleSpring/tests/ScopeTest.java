package ru.ngs.summerjob.LittleSpring.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.LittleSpring.entity.Dog;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();

//        Dog yourDog = context.getBean("dog", Dog.class);
//
//        System.out.println(myDog == yourDog);

        context.close();
    }
}
