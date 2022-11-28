package ru.ngs.summerjob.LittleSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.LittleSpring.entity.Cat;
import ru.ngs.summerjob.LittleSpring.entity.Person;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext3.xml");

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        Person person = context.getBean("person", Person.class);

        person.callPet();

        context.close();
    }
}
