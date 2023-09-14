package com.xworkz.practice.boot;

import com.xworkz.practice.app.dto.EngineeringDTO;
import com.xworkz.practice.app.repository.EngineeringRepository;
import com.xworkz.practice.app.repository.EngineeringRepositoryImpl;
import com.xworkz.practice.app.service.EngineeringService;
import com.xworkz.practice.app.service.EngineeringServiceImpl;

public class EnginneringRunner {
	public static void main(String[] args) {

		EngineeringDTO engineeringDTO = new EngineeringDTO(4, "divya", "jnnce");

		EngineeringRepository engineeringRepository = new EngineeringRepositoryImpl();

		EngineeringService engineeringService = new EngineeringServiceImpl(engineeringRepository);

		engineeringService.validateAndSave(engineeringDTO);

	}


}
