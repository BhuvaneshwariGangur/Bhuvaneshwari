package com.xworkz.practice.app.dto;

import java.io.Serializable;

public class EngineeringDTO implements Serializable{
	private int id;
	private String name;
	private String collegeName;
	

	
	public EngineeringDTO() {
		super();
	}
	
	
	

	public EngineeringDTO(int id, String name, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
	}




	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EngineeringDTO other = (EngineeringDTO) obj;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
