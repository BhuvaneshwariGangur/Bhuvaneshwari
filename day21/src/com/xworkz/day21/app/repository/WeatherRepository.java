package com.xworkz.day21.app.repository;


import com.xworkz.day21.app.dto.WeatherDTO;
import com.xworkz.day21.app.service.WeatherService;

public interface WeatherRepository {
	int TOTAL_LOCATION=5;

	void persist(WeatherService dto);

	void persist(WeatherDTO dto);

}
