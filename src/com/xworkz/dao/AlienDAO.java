package com.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.dto.AlienDTO;

public class AlienDAO {
	private SessionFactory factory;
	
	public AlienDAO(SessionFactory factory) {
		System.out.println(this.getClass().getName()+"created");
		this.factory=factory;
	}
	
	public void saveAlienData(AlienDTO dto) {
	
			org.hibernate.Session session =null;
		
		Transaction transaction=null;
		try {
	/*		
		*Configuration configuration=new Configuration();
		*configuration.configure("resources/alien.xml");
		*configuration.buildSessionFactory();
		*/
		session=factory.openSession();
		transaction=session.beginTransaction();
		session.save(dto);
		transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}if(transaction !=null)
			transaction.rollback();
	}
	
	public void fetchdata(int a_id) {
		org.hibernate.Session session=null;
		Transaction tranction=null;
		session=factory.openSession();
		tranction=session.beginTransaction();
		AlienDTO aliendto=session.get(AlienDTO.class,a_id);
		System.out.println(aliendto);
		session.getTransaction().commit();
	
	}

	public void update(String a_name,int a_id) {
		Session session=null;
		Transaction transaction=null;
		factory.openSession();
		transaction=session.beginTransaction();
		AlienDTO aliendto=session.get(AlienDTO.class,a_id);
		if(aliendto!=null)	{
			aliendto.setId(2);
			aliendto.setColour("blue");
			aliendto.setName("covathu");
			session.update(aliendto);
		}
			session.getTransaction().commit();
			session.close();
	}
	
	public void delete(int a_id) {
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		AlienDTO alienDTO= session.get(AlienDTO.class, a_id);
       if(alienDTO!=null) {
    	   session.delete(alienDTO);
       }
       session.getTransaction().commit();
       session.close();
	}
       
	
}


