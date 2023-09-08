package com.xworkz.day21.app.service;

import com.xworkz.day21.app.dto.DoctorDTO;
import com.xworkz.day21.app.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService{
	private DoctorRepository docterRepository1;
	public DoctorServiceImpl(DoctorRepository doctersRepository, DoctorRepository docterRepository) {
		this.docterRepository1 = docterRepository;
	}

	@Override
	public boolean validateAndSave(DoctorDTO docterDTO) {

		if (docterDTO != null) {
			System.out.println("DTO IS NOT NULL...");

			String name = docterDTO.getName();
			int age = docterDTO.getAge();

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("NAME id VALID");
			} else {
				System.err.println("NAME is INVALID");
				return false;
			}

			if (age != 0) {
				System.out.println("AGE id VALID");
			} else {
				System.err.println("AGE is INVALID");
				return false;
			}

			this.docterRepository1.persist(docterDTO);
			return true;
		}

		return false;
	}

}
