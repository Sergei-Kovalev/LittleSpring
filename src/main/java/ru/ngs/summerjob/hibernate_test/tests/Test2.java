package ru.ngs.summerjob.hibernate_test.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ngs.summerjob.hibernate_test.entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Sidirov", "HR", 700);

            session.beginTransaction();
            session.persist(employee);
//            session.getTransaction().commit();

            int myId = employee.getId();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employeeFromDB = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(employeeFromDB);

            System.out.println("DONE!!!");
        } finally {
            factory.close();
        }
    }
}
