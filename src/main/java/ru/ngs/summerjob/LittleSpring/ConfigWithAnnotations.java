package ru.ngs.summerjob.LittleSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ngs.summerjob.LittleSpring.entity.Cat;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext3.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        context.close();
    }
}
