package com.xworkz.day21.boot;

import com.xworkz.day21.app.dto.WeatherDTO;
import com.xworkz.day21.app.repository.WeatherRepository;
import com.xworkz.day21.app.repository.WeatherRepositoryImpl;
import com.xworkz.day21.app.service.WeatherService;
import com.xworkz.day21.app.service.WeatherServiceImpl;

public class WeatherRunner {
	public static void main(String[] args) {

		WeatherRepository repository = new WeatherRepositoryImpl();
		WeatherService service = new WeatherServiceImpl(repository);
		WeatherDTO dto = new WeatherDTO("Banglore", 90, 50);

		service.validateAndSave(dto);
		service.validateAndSave(null);

	}

}
