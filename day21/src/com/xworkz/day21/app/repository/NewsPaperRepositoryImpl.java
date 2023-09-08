package com.xworkz.day21.app.repository;

import com.xworkz.day21.app.dto.NewsPaperDTO;

public  class NewsPaperRepositoryImpl implements NewsPaperRepository{
	private NewsPaperDTO[] dtos = new NewsPaperDTO[TOTAL];
	private int index;

	@Override
	public void save(NewsPaperDTO dto) {

		if (index < TOTAL) {
			this.dtos[index] = dto;
			System.out.println(dto + " store at position " + this.index);
			this.index++;
		}
		else {
			System.err.println("DS IDS FULL ,, NOT STORE FURTHER");
		}

	}

}
