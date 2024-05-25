package com.norcorp.crud_app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.Student;
import utils.HibernateUtil;


public class DeleteApp 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
        Student student = session.get(Student.class, 1);
      
        Transaction tx = session.beginTransaction();
        
        session.delete(student);
        
        tx.commit();
        
        System.out.println(student);
        
        session.close();
        factory.close();
    }
}
