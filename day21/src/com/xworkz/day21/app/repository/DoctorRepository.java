package com.xworkz.day21.app.repository;

import com.xworkz.day21.app.dto.DoctorDTO;

public interface DoctorRepository {
	int TOTAL = 10;

	void persist(DoctorDTO docterDTO);

}
