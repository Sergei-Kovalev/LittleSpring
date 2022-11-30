package ru.ngs.summerjob.aop.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ngs.summerjob.aop.MyConfig;
import ru.ngs.summerjob.aop.entity.Book;
import ru.ngs.summerjob.aop.entity.UniLibrary;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);

        UniLibrary library1 = context.getBean("uniLibrary", UniLibrary.class);
        library1.getBook();
        library1.addBook("Sergey", book);
        library1.addMagazine();
//        library1.returnBook();
//        library1.returnMagazine();
//        library1.addBook();


//
//        SchoolLibrary library2 = context.getBean("schoolLibrary", SchoolLibrary.class);
//        library2.getBook();

        context.close();
    }
}
