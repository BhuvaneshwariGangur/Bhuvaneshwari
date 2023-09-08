package com.xworkz.day21.app.repository;

import com.xworkz.day21.app.dto.AadharDTO;

public interface AadharRepository {
	int TOTAL = 20;

	void persistant(AadharDTO dto);

}
