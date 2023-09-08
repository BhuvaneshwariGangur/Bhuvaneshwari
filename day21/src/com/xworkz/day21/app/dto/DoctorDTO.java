package com.xworkz.day21.app.dto;

import java.io.Serializable;

public class DoctorDTO implements Serializable{
	private String name;
	private int age;
	
	public DoctorDTO() {
		
	}

	@Override
	public String toString() {
		return "DoctorsDTO [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
