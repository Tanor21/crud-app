package test;

import org.hibernate.SessionFactory;

import utils.HibernateUtils;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory1 = HibernateUtils.getSectionFactory();
		SessionFactory sessionFactory2 = HibernateUtils.getSectionFactory();
		
		if(sessionFactory1 == sessionFactory2) {
			System.out.println("the two session factory objects are same");
		}
		
		System.out.println(sessionFactory1 + " _ " + sessionFactory2);

	}

}
