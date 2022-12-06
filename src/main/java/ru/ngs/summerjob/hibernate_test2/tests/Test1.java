package ru.ngs.summerjob.hibernate_test2.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ngs.summerjob.hibernate_test2.entity.Detail;
import ru.ngs.summerjob.hibernate_test2.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();

            Employee employee = new Employee("Petia", "Ivanov", "Accountants", 999);
            Detail detail = new Detail("St.Peterburg", "222-333-444", "petia@ngs.ru");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.persist(employee);

            session.getTransaction().commit();

            System.out.println("DONE!!!");
//
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Oleg", "Petrov", "IT", 700);
//            Detail detail = new Detail("Moskow", "654-66-445", "Olegek@mail.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.persist(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!!!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!!!");
//
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 2);
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
