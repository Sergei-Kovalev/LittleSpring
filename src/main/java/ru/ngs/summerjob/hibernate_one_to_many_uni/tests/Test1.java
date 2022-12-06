package ru.ngs.summerjob.hibernate_one_to_many_uni.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ngs.summerjob.hibernate_one_to_many_uni.entity.Department;
import ru.ngs.summerjob.hibernate_one_to_many_uni.entity.Employee;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Department department = new Department("HR", 1500, 300);
//            Employee em1 = new Employee("Oleg", "Ivanov", 800);
//            Employee em2 = new Employee("Andrei", "Sidorov", 1000);
//            department.addEmployeeToDepartment(em1);
//            department.addEmployeeToDepartment(em2);
//
//            session.beginTransaction();
//
//            session.persist(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!!!");
////
////***//**********************************
////
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 3);
//            System.out.println(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!!!");
//
////
////******************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class, 3);

            session.remove(department);

            session.getTransaction().commit();

            System.out.println("DONE!!!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
