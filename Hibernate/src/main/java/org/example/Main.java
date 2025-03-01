package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
    Student s1=new Student();
        s1.setName("saiteja");
        s1.setRoll(107);
        s1.setAge(23);

      Configuration config= new Configuration();
      config.addAnnotatedClass(Student.class);
      config.configure();
        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();

        Transaction transaction=session.beginTransaction();
        session.save(s1);
        transaction.commit();


    }
}