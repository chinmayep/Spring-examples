package com.xworkz.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dao.AlienDAO;
import com.xworkz.dto.AlienDTO;

public class SpringTester {
	
	public static void main(String[] args) {
		try {
			
			ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("resources/spring.xml");
			AlienDAO dao=container.getBean(AlienDAO.class);
			
			AlienDTO dto=new AlienDTO();
			dto.setColour("blue");
			dto.setId(2);
			dto.setIsalien(false);
			dto.setName("lalithu");
			dao.saveAlienData(dto);
			dao.update("cathu", 3);
			dao.delete(1);
			
		}catch(Exception e) {
			
		}
	}

}
