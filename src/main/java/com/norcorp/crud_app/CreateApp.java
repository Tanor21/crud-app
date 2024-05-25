package com.norcorp.crud_app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.Student;
import utils.HibernateUtil;


public class CreateApp 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
        // Student save - create
        Student st = new Student();
        st.setName("Safiou");
        st.setAddress("Canada");
        st.setEmail("safiou@gmail.com");
        st.setCollageName("ETS");
        
        
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        //session.save(st2);
        
        tx.commit();
        
        System.out.println(st);
        
        // Read data from database
        //List<Student> list = session.createQuery("from Student", Student.class).list();
        //list.forEach(s -> System.out.println(s));
        
        session.close();
        factory.close();
    }
}
