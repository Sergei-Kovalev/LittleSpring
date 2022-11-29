package ru.ngs.summerjob.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take a book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("We return the book to UniLibrary");
    }

    public void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("We return a magazine to UniLibrary");
    }

    public void addBook() {
        System.out.println("We add book to UniLibrary");
    }


    public void addMagazine() {
        System.out.println("We add magazine to UniLibrary");
    }

}
