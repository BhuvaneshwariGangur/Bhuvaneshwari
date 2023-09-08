package com.xworkz.day21.app.service;

import com.xworkz.day21.app.dto.NewsPaperDTO;

public interface NewsPaperService {
	boolean validateAndSave(NewsPaperDTO dto);

}
