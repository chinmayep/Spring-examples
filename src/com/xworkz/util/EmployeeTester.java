package com.xworkz.util;

import com.xworkz.dao.EmployeeDAO;
import com.xworkz.dto.EmployeeDTO;

public class EmployeeTester {
	

	public static void main(String[] args) {
		
		EmployeeDTO empldto=new EmployeeDTO();
		empldto.setEmp_id(01);
		empldto.setEmp_name("chinmaye");
		empldto.setEmp_sal(250000);
		empldto.setEmp_expence(2.5);
		

		EmployeeDAO empldao=new EmployeeDAO();
		empldao.saveEmployeeData(empldto);
		
		
		
	}

}
