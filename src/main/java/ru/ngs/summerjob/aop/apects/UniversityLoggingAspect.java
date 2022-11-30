package ru.ngs.summerjob.aop.apects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.ngs.summerjob.aop.entity.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice(): logging getting a list of students before running method getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        Student student1 = students.get(0);

        String  nameSurname = student1.getNameAndSurname();
        nameSurname = "Mr. " + nameSurname;
        student1.setNameAndSurname(nameSurname);

        double avgGrade = student1.getAvgGrade();
        avgGrade = avgGrade + 1;
        student1.setAvgGrade(avgGrade);

        System.out.println("afterGetStudentsLoggingAdvice(): logging getting a list of students after running method getStudents()");
    }
}
