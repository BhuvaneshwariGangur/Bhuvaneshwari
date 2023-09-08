package com.xworkz.day21.boot;

import com.xworkz.day21.app.dto.AadharDTO;
import com.xworkz.day21.app.repository.AadharRepository;
import com.xworkz.day21.app.repository.AadharRepositoryImpl;
import com.xworkz.day21.app.service.AadharService;
import com.xworkz.day21.app.service.AadharServiceImpl;

public class AadharRunner {
	public static void main(String[] args) {

		AadharDTO aadharDTO = new AadharDTO(673488347834l, "Karnataka", "kannda");

		AadharRepository aadharRepository = new AadharRepositoryImpl();

		AadharService aadharService = new AadharServiceImpl(aadharRepository);

		aadharService.validateAndSave(aadharDTO);

	}

}
