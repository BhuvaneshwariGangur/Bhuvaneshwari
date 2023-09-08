package com.xworkz.day21.app.repository;

import com.xworkz.day21.app.dto.NewsPaperDTO;

public interface NewsPaperRepository {
	int TOTAL=10;
	 void save(NewsPaperDTO dto);
}
