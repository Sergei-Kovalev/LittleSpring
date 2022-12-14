package ru.ngs.summerjob.hibernate_test.tests;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ngs.summerjob.hibernate_test.entity.Employee;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(999);

            Query query = session.createQuery("UPDATE Employee SET salary = 888 WHERE name = :name");
            query.setParameter("name", "Alexander");
            query.executeUpdate();
//            session.createQuery("UPDATE Employee SET salary = 777 WHERE name = 'Alexander'")
//                    .executeUpdate();

            session.getTransaction().commit();

            System.out.println("DONE!!!");
        } finally {
            factory.close();
        }
    }
}
