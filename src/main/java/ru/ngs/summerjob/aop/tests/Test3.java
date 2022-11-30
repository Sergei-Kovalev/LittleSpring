package ru.ngs.summerjob.aop.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ngs.summerjob.aop.MyConfig;
import ru.ngs.summerjob.aop.entity.UniLibrary;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.printf("Book with a name %s returns to the library.\n", bookName);

        context.close();

        System.out.println("Method main ends");
    }
}
