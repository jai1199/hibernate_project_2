package com.jsp.in.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	Person p1=new Person();
    	p1.setpId(10);
    	p1.setpName("Raja");
    	p1.setpContact(7888888L);
    	
    	Person p2=new Person();
    	p2.setpId(11);
    	p2.setpName("Ramu");
    	p2.setpContact(677777L);
    	
    	Person p3=new Person();
    	p3.setpId(12);
    	p3.setpName("sonu");
    	p3.setpContact(7666L);
    	
    	Person p4=new Person();
    	p4.setpId(13);
    	p4.setpName("Rohan");
    	p4.setpContact(53455L);
    	
    	
    	Vehicle v1=new Vehicle();
    	v1.setvId(9470);
    	v1.setvName("Royal Enfield");
    	v1.setPrice(8880000);
    	
    	Vehicle v2=new Vehicle();
    	v2.setvId(9471);
    	v2.setvName("RX 100");
    	v2.setPrice(9990000);
    	
    	Vehicle v3=new Vehicle();
    	v3.setvId(9472);
    	v3.setvName("R15");
    	v3.setPrice(999000);
    	
    	v1.setPerson(p2);
    	v2.setPerson(p2);
    	v3.setPerson(p2);
    	
    	p1.getVlist().add(v1);
    	p1.getVlist().add(v2);
    	
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Vehicle.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction trans = s.beginTransaction();
		
		s.save(p1);
		s.save(p2);
		s.save(p3);
		s.save(p4);
		s.save(v1);
		s.save(v2);
		trans.commit();
		s.close();
    }
}
