package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.ngs.summerjob.aop.entity.Book;

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

    @Before("ru.ngs.summerjob.aop.apects.MyPointcuts.allAddMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {                             //Advice указывает что это метод внутри аспект класса

         MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Book information: \n" +
                            "Book name: " + myBook.getName() + "| Book author: " + myBook.getAuthor() + "| Book year of publishing: " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Book to the library added by " + obj);
                }
            }
        }
        System.out.println("beforeAddLoggingAdvice(): logging of try to get a book/magazine");
        System.out.println("---------------------------------------------");
    }

}
