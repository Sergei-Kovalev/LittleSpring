package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("ru.ngs.summerjob.aop.apects.MyPointcuts.allAddMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice(): Catch exception when trying to take a book/magazine");
        System.out.println("---------------------------------------------");
    }
}
