package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}
}
