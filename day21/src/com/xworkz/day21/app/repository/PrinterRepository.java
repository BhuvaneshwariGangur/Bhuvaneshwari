package com.xworkz.day21.app.repository;

import com.xworkz.day21.app.dto.PrinterDTO;

public interface PrinterRepository {
	int TOATL = 10;

	void persist(PrinterDTO dto);

}
