package com.xworkz.day21.boot;

import com.xworkz.day21.app.dto.PrinterDTO;
import com.xworkz.day21.app.repository.PrinterRepository;
import com.xworkz.day21.app.repository.PrinterRepositoryImpl;
import com.xworkz.day21.app.service.PrinterService;
import com.xworkz.day21.app.service.PrinterServiceImpl;

public class PrinterRunner {
	public static void main(String[] args) {

		PrinterRepository printerRepository = new PrinterRepositoryImpl();

		PrinterService printerService = new PrinterServiceImpl(printerRepository);

		PrinterDTO dto = new PrinterDTO();

		printerService.validateAndSave(dto);

	}

}
