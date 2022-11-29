package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {                                         //Advice указывает что это метод внутри аспект класса
        System.out.println("beforeGetBookAdvice(): trying to get a book");
    }

}