   package com.demo.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class UpdateData {

	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		MetadataSources sources = new MetadataSources(registry);
		Metadata metadata = sources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		//select * from My_order where oid=1
		Order orderDetail=session.get(Order.class,2);
		orderDetail.setShippingAddress("chennai");
		session.update(orderDetail);
		

		tx.commit();
		session.close();
     
	}

}
