package com.uk.demoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StudentDataInsert {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		MetadataSources sources = new MetadataSources(registry);
		Metadata metadata = sources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student s = new Student();
		s.setSname("tokio");
		s.setAdress("spain");
		session.save(s);
         tx.commit();
         session.close();
	
	}
}
