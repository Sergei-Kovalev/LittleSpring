package ru.ngs.summerjob.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take a book from UniLibrary");
    }

    public String returnBook() {
        System.out.println("We return the book to UniLibrary");
        return "Ok";
    }

    public void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
    }
}