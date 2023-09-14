package com.xworkz.practice.boot;

import com.xworkz.practice.app.dto.StudentDTO;
import com.xworkz.practice.app.repository.StudentRepository;
import com.xworkz.practice.app.repository.StudentRepositoryImpl;
import com.xworkz.practice.app.service.StudentService;
import com.xworkz.practice.app.service.StudentServiceImpl;

public class StudentRunner {
	public static void main(String[] args) {

		StudentRepository repository = new StudentRepositoryImpl();
		StudentService service = new StudentServiceImpl(repository);
		StudentDTO dto = new StudentDTO(1, "Bhuvana", "4jnb19is018", "ISE", "SHIVAMOGA", "jnnce", "smg", 577511, 384756,
				10, 9, 2019, 1023, false, true, true, 7500, "jnnce hostel", "ashwathnagar", 36000, 2023, 18000, 999, 82,
				false);
		StudentDTO dto1 = new StudentDTO(1, "Bhuvana", "4ub18is018", "ISE", "shivamoga", "jnnce", "smg", 577501, 384756,
				10, 9, 2019, 1023, false, true, true, 7500, "jnnce hostel", "ahwathnagar", 36000, 2023, 18000, 999, 82,
				false);

		service.validateAndSave(dto);
		service.validateAndSave(dto1);

		System.out.println("-----------------");

		StudentDTO dto2 = service.findByName("Bhuvana");
		System.out.println("FOUND Name is " + dto2.getName());

		System.out.println("-----------------");

		StudentDTO dto3 = service.findByUSN("4ub19is018");
		System.out.println("FOUND Name is " + dto3.getUsn());

		System.out.println("-----------------");

		StudentDTO dto4 = service.findByClgName("jnnce");
		System.out.println("FOUND Name is " + dto4.getClgName());

		System.out.println("-----------------");

		StudentDTO dto5 = service.findById(1);
		System.out.println("FOUND Name is " + dto5.getId());

		

	}

}
