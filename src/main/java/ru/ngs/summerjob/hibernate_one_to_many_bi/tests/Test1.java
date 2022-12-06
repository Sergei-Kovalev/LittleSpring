package ru.ngs.summerjob.hibernate_one_to_many_bi.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ngs.summerjob.hibernate_one_to_many_bi.entity.Department;
import ru.ngs.summerjob.hibernate_one_to_many_bi.entity.Employee;


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
//            Department department = new Department("IT", 1000, 500);
//            Employee em1 = new Employee("Petia", "Sidorov", 700);
//            Employee em2 = new Employee("Elena", "Degrenova", 900);
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
//
//****************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!!!");
//
//
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!!!");

//
//
            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 4);

            session.remove(employee);

            session.getTransaction().commit();

            System.out.println("DONE!!!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
