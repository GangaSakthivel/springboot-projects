package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Alice");
        student.setEmail("alice@example.com");

        Student student1 = new Student();
        student.setId(2);
        student.setName("Ganga");
        student.setEmail("ganga@example.com");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class); // KEY FIX!

        try (SessionFactory factory = cfg.buildSessionFactory();
             Session session = factory.openSession()) {

            Transaction tx = session.beginTransaction();
            session.persist(student);
            session.persist(student1);
            tx.commit();
            System.out.println("Student saved successfully!");
        }
    }
}