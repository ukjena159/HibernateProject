   package com.demo.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class InsertData {
 
	public static void main(String[] args) {
		// load the configuration file
		// create sessionfactory object
		// create session object
		// create trasaction object

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		// Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);
		// Create Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		// Create SessionFactory
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// triensient state start here
		// a newly created object that never associated with any session
		Order o = new Order();
		o.setOrderName("abc");
		o.setShippingAddress("bangalore");
		// triensient state end here
		
		 session.save(o);
		//session.persist(o);

		tx.commit();
		session.close();

		System.out.println("inserted two recordd");
       System.out.println("inserted successfully");
	}

}
