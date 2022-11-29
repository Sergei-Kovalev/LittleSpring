package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {                                         //Advice указывает что это метод внутри аспект класса
        System.out.println("beforeGetLoggingAdvice(): trying to get a book/magazine");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice(): checking rights to get a book/magazine");
    }

}
