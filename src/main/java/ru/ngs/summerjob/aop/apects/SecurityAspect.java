package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("ru.ngs.summerjob.aop.apects.MyPointcuts.allAddMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice(): checking rights to get a book/magazine");
        System.out.println("---------------------------------------------");
    }
}
