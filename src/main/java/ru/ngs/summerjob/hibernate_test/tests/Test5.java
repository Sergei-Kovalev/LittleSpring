package ru.ngs.summerjob.hibernate_test.tests;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ngs.summerjob.hibernate_test.entity.Employee;

import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 0);
//            session.remove(employee);
//
//            List<Employee> resultList = session.createQuery("from Employee WHERE name = 'Oleg'", Employee.class).getResultList();
//            for (Employee e : resultList) {
//                session.remove(e);
//            }

            session.createMutationQuery("DELETE Employee WHERE name = 'Elena'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("DONE!!!");
        } finally {
            factory.close();
        }
    }
}
