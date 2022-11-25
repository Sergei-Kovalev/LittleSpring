package ru.ngs.summerjob.LittleSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.LittleSpring.entity.Person;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callPet();
        System.out.printf("Hello, my surname is %s, my age is %d%n", person.getSurname(), person.getAge());

        context.close();
    }
}
