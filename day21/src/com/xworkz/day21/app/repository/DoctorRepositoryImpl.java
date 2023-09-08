package com.xworkz.day21.app.repository;

import com.xworkz.day21.app.dto.DoctorDTO;

public  class DoctorRepositoryImpl implements DoctorRepository{
	
	private DoctorDTO[] docterDTOs = new DoctorDTO[TOTAL];
	private int position;

	public void persist(DoctorDTO docterDTO) {

		if (position < TOTAL) {
			this.docterDTOs[position] = docterDTO;
			System.out.println(docterDTO + " Store at position " + this.position);
			this.position++;
		} else {
			System.err.println("DATA SRORE IS FULL,,CANNOT PERSIST..");
		}

	}

}
