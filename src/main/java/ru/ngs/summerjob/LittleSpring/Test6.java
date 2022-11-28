package ru.ngs.summerjob.LittleSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ngs.summerjob.LittleSpring.entity.MyConfig;
import ru.ngs.summerjob.LittleSpring.entity.Person;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("person", Person.class);
        System.out.printf("My surname: %s. I'm %d years old \n", person.getSurname(), person.getAge());
        person.callPet();

        context.close();
    }
}
