package ru.ngs.summerjob.spring_entrance.entity;

//@Component("catBean")                       // если не указать id в скобках - присвоится дефолтный id = название класса с маленькой буквы
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
