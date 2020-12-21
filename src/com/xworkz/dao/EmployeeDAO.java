package com.xworkz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;
import com.xworkz.dto.EmployeeDTO;

public class EmployeeDAO {
	
	SessionFactory factory;
	
	public EmployeeDAO() {
		System.out.println(this.getClass().getSimpleName()+"creted");
	}


	public void saveEmployeeData(EmployeeDTO dto) {
		org.hibernate.Session session =null;
		Transaction transaction=null;
		try {
			Configuration configuration=new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			factory=configuration.buildSessionFactory();
			session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(dto);
			transaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(transaction !=null)
				transaction.rollback();
			
		}finally {
			if(session !=null) {
				session.close();
			}
			if(factory !=null) {
				factory.close();
			}
		}
			
			
		
		
		
		
	}
	
}
