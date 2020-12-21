package com.xworkz.util;



//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

//import com.xworkz.dao.AlienDAO;
import com.xworkz.dto.AlienDTO;

public class AlienTester {
 public static void main(String[] args) {
	AlienDTO aliendto=new AlienDTO();
	aliendto.setColour("blue");
	aliendto.setId(5);
	aliendto.setIsalien(true);
	aliendto.setName("cthulhi");
	
	//AlienDAO aliendao=new AlienDAO();
	//aliendao.saveAlienData(aliendto);
	
	//LocalSessionFactoryBean lfsb=new LocalSessionFactoryBean();
	
	
}
}