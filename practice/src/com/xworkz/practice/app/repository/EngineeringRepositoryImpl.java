package com.xworkz.practice.app.repository;

import com.xworkz.practice.app.dto.EngineeringDTO;

public class EngineeringRepositoryImpl implements EngineeringRepository{
	private EngineeringDTO[] dtos = new EngineeringDTO[TOTAL];
	private int position;

	@Override
	public void persistant(EngineeringDTO dto) {

		if (position < TOTAL) {
			this.dtos[position] = dto;
			System.out.println(dto + " stored at position " + position);
			this.position++;
		}

		else {
			System.err.println("STORAGE IS FULL CANNOT STORE FURTHER");
		}

	}
}
