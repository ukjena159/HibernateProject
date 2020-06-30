package com.demo.database;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HQLDemo2 {

	public static void main(String[] args) {
		// Criteria
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		// Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);
		// Create Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		// Create SessionFactory
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "select orderName FROM Order";
		Query query = session.createQuery(hql);
		List<String> results =query.getResultList();

		
		tx.commit();
		session.close();
        for(String o :results){
        	System.out.println(o);
        }
	}

}
