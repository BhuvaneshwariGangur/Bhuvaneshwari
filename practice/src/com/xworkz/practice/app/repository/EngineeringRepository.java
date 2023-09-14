package com.xworkz.practice.app.repository;

import com.xworkz.practice.app.dto.EngineeringDTO;

public interface EngineeringRepository {
	int TOTAL=10;
	
	void persistant(EngineeringDTO dto);
	
	default Boolean isExist(String Engineer) {
		return false;
	}

}
