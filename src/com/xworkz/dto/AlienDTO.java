package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
@Table(name="aliendetail")
public class AlienDTO {
	@Id
	@Column(name="a_id")
	private int id;
	@Column(name="a_name")
	private String name;
	@Column(name="boolean")
	private Boolean isalien;
	@Column(name="a_colour")
	private String colour;
	
	public void AlienDTO() {
		System.out.println(this.getClass().getName()+"created");
	}
	
	

}
