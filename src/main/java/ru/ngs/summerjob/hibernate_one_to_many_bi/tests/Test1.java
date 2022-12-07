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
//            Department department = new Department("Sales", 1500, 800);
//            Employee em1 = new Employee("Petia", "Sidorov", 800);
//            Employee em2 = new Employee("Elena", "Degrenova", 1500);
//            Employee em3 = new Employee("Fedor", "Povetkin", 1200);
//
//            department.addEmployeeToDepartment(em1);
//            department.addEmployeeToDepartment(em2);
//            department.addEmployeeToDepartment(em3);
//
//            session.beginTransaction();
//
//            session.persist(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!!!");

//***************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get Department");
            Department department = session.get(Department.class, 4);
            System.out.println("Show Department");
            System.out.println(department);

            System.out.println("Load target Department employees");
            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());


            System.out.println("DONE!!!");

//****************************************************************
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
//*************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 4);
//
//            session.remove(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!!!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
