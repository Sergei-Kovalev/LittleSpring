package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* ru.ngs.summerjob.aop.entity.UniLibrary.*(..))")
//    private void allMethodsFromUnilibrary(){}
//
//    @Pointcut("execution(public void ru.ngs.summerjob.aop.entity.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUnilibrary(){}
//
//    @Pointcut("allMethodsFromUnilibrary() && !returnMagazineFromUnilibrary()")
//    private void allMethodsExceptReturnMethodFromUnilibrary(){}
//
//    @Before("allMethodsExceptReturnMethodFromUnilibrary()")
//    public void BeforeAllMethodsExceptReturnMethodAdvice() {
//        System.out.println("BeforeAllMethodsExceptReturnMethodAdvice(): Log #6");
//    }

//
//    @Pointcut("execution(* ru.ngs.summerjob.aop.entity.UniLibrary.get*())")
//    private void allGetMethodsFromUnilibrary(){}
//
//    @Pointcut("execution(* ru.ngs.summerjob.aop.entity.UniLibrary.return*())")
//    private void allReturnMethodsFromUnilibrary(){}
//
//    @Pointcut("allGetMethodsFromUnilibrary() || allReturnMethodsFromUnilibrary()")      //комбинированный Pointcut построенный на условии из 2х выще
//    private void allGetAndReturnMethodsFromUnilibrary(){}
//
//    @Before("allGetMethodsFromUnilibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice(): writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUnilibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice(): writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUnilibrary()")                                   //Advice для Pointcut который описали выше
//    public void beforeGetAndReturnAdvice() {
//        System.out.println("beforeGetAndReturnAdvice(): writing Log #3");
//    }

    @Before("ru.ngs.summerjob.aop.apects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {                                         //Advice указывает что это метод внутри аспект класса
        System.out.println("beforeGetLoggingAdvice(): logging of try to get a book/magazine");
    }

}
