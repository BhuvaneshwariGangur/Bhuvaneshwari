package com.xworkz.day21.boot;

import com.xworkz.day21.app.dto.NewsPaperDTO;
import com.xworkz.day21.app.repository.NewsPaperRepository;
import com.xworkz.day21.app.repository.NewsPaperRepositoryImpl;
import com.xworkz.day21.app.service.NewsPaperService;
import com.xworkz.day21.app.service.NewsPaperServiceImpl;

public class NewsPaperRunner {
	public static void main(String[] args) {

		NewsPaperRepository newsPaperRepository=new NewsPaperRepositoryImpl();

		NewsPaperService newsPaperService=new NewsPaperServiceImpl(newsPaperRepository);

		NewsPaperDTO dto=new NewsPaperDTO("Hindustani","Abhi",8);
		NewsPaperDTO dto2=new NewsPaperDTO("Hindustani",null,8);

		newsPaperService.validateAndSave(dto);
		System.out.println();
		newsPaperService.validateAndSave(dto2);
		System.out.println();

		newsPaperService.validateAndSave(null);


	}

}
