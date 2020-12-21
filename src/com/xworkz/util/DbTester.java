package com.xworkz.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbTester {
	
	public static void main(String[] args) {
try(ClassPathXmlApplicationContext  container= new ClassPathXmlApplicationContext("resources/datasource.xml")){
			
			System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
			
			DataSource db= container.getBean(DataSource.class);
			System.out.println(db);
			Connection connection= db.getConnection();
			System.out.println(connection);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}


