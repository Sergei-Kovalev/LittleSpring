package ru.ngs.summerjob.hibernate_test2.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ngs.summerjob.hibernate_test2.entity.Detail;
import ru.ngs.summerjob.hibernate_test2.entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.remove(detail);

            session.getTransaction().commit();

            System.out.println("DONE!!!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
