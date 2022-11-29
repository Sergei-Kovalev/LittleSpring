package ru.ngs.summerjob.aop.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ngs.summerjob.aop.MyConfig;
import ru.ngs.summerjob.aop.entity.Library;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();

        context.close();
    }
}
