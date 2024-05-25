package com.norcorp.crud_app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.Student;
import utils.HibernateUtil;


public class UpdateApp 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
        
        Student student = session.get(Student.class, 6);
        student.setCollageName("ETS University");
        
        Transaction tx = session.beginTransaction();
        
        session.update(student);
        
        tx.commit();
        
        System.out.println(student);
        
        session.close();
        factory.close();
    }
}
