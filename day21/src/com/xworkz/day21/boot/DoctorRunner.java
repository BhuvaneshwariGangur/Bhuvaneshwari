package com.xworkz.day21.boot;

import com.xworkz.day21.app.dto.DoctorDTO;
import com.xworkz.day21.app.repository.DoctorRepository;
import com.xworkz.day21.app.repository.DoctorRepositoryImpl;
import com.xworkz.day21.app.service.DoctorService;
import com.xworkz.day21.app.service.DoctorServiceImpl;

public class DoctorRunner {
	public static void main(String[] args) {

		DoctorRepository docterRepository = new DoctorRepositoryImpl();
		DoctorService docterService = new DoctorServiceImpl(docterRepository, docterRepository);
		DoctorDTO docterDTO = new DoctorDTO();

		docterService.validateAndSave(docterDTO);
	}
}

