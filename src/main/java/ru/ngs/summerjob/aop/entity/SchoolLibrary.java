package ru.ngs.summerjob.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take the book from SchoolLibrary");
    }
}
