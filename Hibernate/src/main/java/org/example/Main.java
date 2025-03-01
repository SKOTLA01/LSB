package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void InsertDate(Student obj,Session session){

        Transaction transaction=session.beginTransaction();
//        session.save(s1);
        session.persist(obj);
        transaction.commit();
    }
    public static  void fetchData(Session session,int roll){
        Student s2=session.get(Student.class,roll);
        System.out.println(s2);
    }
    public static void main(String[] args) {
    Student s1=new Student();
        s1.setName("Sunil");
        s1.setRoll(114);
        s1.setAge(23);

      Configuration config= new Configuration();
      config.addAnnotatedClass(Student.class);
      config.configure();
        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();
        // InsertDate(s1,session);
    fetchData(session,107);
        session.close();
    sf.close();

    }
}