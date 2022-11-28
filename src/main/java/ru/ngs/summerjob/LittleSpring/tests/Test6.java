package ru.ngs.summerjob.LittleSpring.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ngs.summerjob.LittleSpring.MyConfig;
import ru.ngs.summerjob.LittleSpring.entity.Cat;
import ru.ngs.summerjob.LittleSpring.entity.Person;
import ru.ngs.summerjob.LittleSpring.entity.Pet;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet myCat = context.getBean("catBean", Pet.class);
//        myCat.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.printf("My surname: %s. I'm %d years old \n", person.getSurname(), person.getAge());
        person.callPet();

        context.close();
    }
}
