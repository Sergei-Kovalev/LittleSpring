package ru.ngs.summerjob.hibernate_test.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ngs.summerjob.hibernate_test.entity.Employee;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employeeList = session.createQuery("FROM Employee", Employee.class)  //в hql пишется имя класса а не таблицы
//                    .getResultList();

            List<Employee> employeeList = session.createQuery(
                    "FROM Employee where name = 'Alex' and salary > 400 ", Employee.class)  //в hql пишется имя класса а не таблицы
                    .getResultList();

            for (Employee e : employeeList) {
                System.out.println(e);
            }

            session.getTransaction().commit();

            System.out.println("DONE!!!");
        } finally {
            factory.close();
        }
    }
}
