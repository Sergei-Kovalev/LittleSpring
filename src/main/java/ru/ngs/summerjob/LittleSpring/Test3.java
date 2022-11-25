package ru.ngs.summerjob.LittleSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.LittleSpring.entity.Person;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

        context.getBean("myPerson", Person.class).callPet();

        context.close();
    }
}
