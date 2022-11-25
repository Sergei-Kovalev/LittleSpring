package ru.ngs.summerjob.LittleSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.LittleSpring.entity.Pet;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
