package ru.ngs.summerjob.aop.entity;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("We take the book");
    }
}
