package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice(): someone trying to return a book to the library");

        Long begin = System.currentTimeMillis();

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.printf("aroundReturnBookLoggingAdvice(): exception \"%s\" was caught\n", e);
            throw e;
        }

        Long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice(): someone successfully returns a book to the library");

        System.out.println("aroundReturnBookLoggingAdvice(): Method returnBook() ends by " + (end - begin) + " millis");

        return targetMethodResult;
    }
}
