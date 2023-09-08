package com.xworkz.day21.app.service;

import com.xworkz.day21.app.dto.DoctorDTO;

public interface DoctorService {
	boolean validateAndSave(DoctorDTO docterDTO);

}
