package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.Student;

public class HibernateUtils {
	
	
	private static SessionFactory sessionFactory = null;
	
	
	public static SessionFactory getSectionFactory() {
		
		if(sessionFactory == null) {
		
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Student.class);
			
			
			sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}

}
