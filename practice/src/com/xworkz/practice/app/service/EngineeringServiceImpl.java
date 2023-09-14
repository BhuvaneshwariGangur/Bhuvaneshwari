package com.xworkz.practice.app.service;

import com.xworkz.practice.app.dto.EngineeringDTO;
import com.xworkz.practice.app.repository.EngineeringRepository;

public  class EngineeringServiceImpl implements EngineeringService{
	
	private EngineeringRepository engineerRepository;
	private Object engineeringRepository;

	public EngineeringServiceImpl(EngineeringRepository engineerRepository) {
		this.engineeringRepository = engineeringRepository;
	}
	
	@Override
	public boolean validateAndSave(EngineeringDTO engineeringDTO) {

		if (engineeringDTO != null) {
			System.out.println("DTO is not null");

			int id = engineeringDTO.getId();
			String name = engineeringDTO.getName();
			String collegeName = engineeringDTO.getCollegeName();

			if (id != 0) {
				System.out.println("id is VAlid");
			} else {
				System.err.println("id is Invalid");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("name is VAlid");
			} else {
				System.err.println("name is Invalid");
				return false;
			}

			if (collegeName != null && !collegeName.isEmpty() && collegeName.length() >= 3 && collegeName.length() <= 20) {
				System.out.println("collegeName is VAlid");
			} else {
				System.err.println("collegeName is Invalid");
				return false;
			}

			((EngineeringRepository) this.engineeringRepository).	persistant(engineeringDTO );

			return true;
		}

		return false;
	}

}
