package com.demo.collecion;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestCollection {
	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		// Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);
		// Create Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		// Create SessionFactory
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpName("sergio");
		emp.setSalary(20000);
		Address add = new Address();

		add.setCity("Banglore");
		add.setPincode(560037);
		add.setState("karnataka");
		add.setEmp(emp);
		
		Address add2 = new Address();
		add2.setCity("bhubaneswar");
		add2.setPincode(761129);
		add2.setState("odisha");
		add2.setEmp(emp);
		
		List<Address> list = new ArrayList<>();
		list.add(add);
		list.add(add2);

		
		emp.setAddress(list);
		/*session.save(add);
		session.save(add2);*/
		session.save(emp);
		tx.commit();
		session.close();

	}

}
