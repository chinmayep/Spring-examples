package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name="emp_detail")
public class EmployeeDTO {
	@Id
	@Column(name="e_id")
	private int emp_id;
	@Column(name="e_name")
	private String emp_name;
	@Column(name="e_sal")
	private int emp_sal;
	@Column(name="e_exp")
	private double emp_expence;
	
	
	public void EmployeeDTO() {
		System.out.println(this.getClass().getName()+"created");
	}
	
	
	

}
