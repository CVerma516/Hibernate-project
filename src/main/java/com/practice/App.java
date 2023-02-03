package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
       Student s=new Student();
       s.setId(1);
       s.setName("shaista");
       s.setCity("patna");
       System.out.println(s);
       
       Session session=factory.getCurrentSession();
       Transaction tx= session.beginTransaction();
       session.save(s);
       tx.commit();
       session.close();
    }
}
