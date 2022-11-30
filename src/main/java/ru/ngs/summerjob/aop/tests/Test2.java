package ru.ngs.summerjob.aop.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ngs.summerjob.aop.MyConfig;
import ru.ngs.summerjob.aop.entity.Student;
import ru.ngs.summerjob.aop.entity.University;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("We catch exception " + e);
        }

        context.close();
    }

}
