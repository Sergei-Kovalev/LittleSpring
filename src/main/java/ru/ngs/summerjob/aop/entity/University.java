package ru.ngs.summerjob.aop.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Sergei Belov", 2, 7.8);
        Student st2 = new Student("Petia Rogov", 1, 5.8);
        Student st3 = new Student("Daria Osmolovskaya", 4, 8.1);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Start of running method getStudents()");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents():");
        System.out.println(students);
        return students;
    }
}
