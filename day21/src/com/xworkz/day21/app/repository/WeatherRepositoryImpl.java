package com.xworkz.day21.app.repository;

import com.xworkz.day21.app.dto.WeatherDTO;
import com.xworkz.day21.app.service.WeatherService;

public  class WeatherRepositoryImpl implements WeatherRepository{
	
	private WeatherDTO[] dtos = new WeatherDTO[TOTAL_LOCATION];
	private int position;

	@Override
	public void persist(WeatherDTO dto) {

		if (position < TOTAL_LOCATION) {
			this.dtos[position] = dto;
			System.out.println(dto + " Store at position : " + this.position);
			this.position++;
		}

	}

	@Override
	public void persist(WeatherService dto) {
		// TODO Auto-generated method stub
		
	}

}
