package com.norcorp.crud_app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.Student;
import utils.HibernateUtil;


public class ReadApp 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
       
        Student student = session.get(Student.class, 2);
        
        System.out.println(student);
        
        session.close();
        factory.close();
    }
}
