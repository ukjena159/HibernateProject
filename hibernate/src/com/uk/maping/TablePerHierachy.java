package com.uk.maping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TablePerHierachy {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		TeamIndia india = new TeamIndia();
		india.setFirstName("ravi ");
		india.setLastName("sastri");
		Batsman bating=new Batsman();
		bating.setFirstName("rohit");
		bating.setLastName("sharma");
		bating.setBatingHand("rihgt");
		bating.setHighestScore(270);
		Batsman bating2 = new Batsman();
		bating2.setFirstName(" ms");
		bating2.setLastName("Dhoni");
		bating2.setBatingHand("right");
		bating2.setHighestScore(200);
		Batsman bating3 = new Batsman();
		bating3.setFirstName(" virat");
		bating3.setLastName("kohili");
		bating3.setBatingHand("right");
		bating3.setHighestScore(264);
		Bowler ball=new Bowler();
		 ball.setFirstName(" rabindra");
         ball.setLastName("jadja");
         ball.setBowlingHand("right");
         ball.setWickect(20);
         Bowler ball2=new Bowler();
         ball2.setFirstName(" bhubaneswar");
         ball2.setLastName("kumar");
         ball2.setBowlingHand("right");
         ball2.setWickect(19);
         session.save(india);
         session.save(bating);
         session.save(bating2);
         session.save(bating3);
         session.save(ball);
         session.save(ball2);
         t.commit();    
         session.close();    
         System.out.println(" inserted successfully");     
	}

}
