package com.xworkz.dto.dp;

import com.xworkz.dto.dp.constants.Genre;
import com.xworkz.dto.dp.dao.WebSeriesDAO;
import com.xworkz.dto.dp.dto.WebSeriesDTO;

public class WebSeriesStarter {

	public static void main(String[] args) {
		WebSeriesDTO dto = new WebSeriesDTO();
		WebSeriesDAO dao = new WebSeriesDAO();

		WebSeriesDTO dto1 = new WebSeriesDTO("Vampire Diaries", Genre.ROMANTIC, "Paul Wesley", 50, "5.5star", 8, 3);
		WebSeriesDTO dto2 = new WebSeriesDTO("Vampire Diaries", Genre.ROMANTIC, "ian", 50, "5.5star", 8, 3);
		WebSeriesDTO dto3 = new WebSeriesDTO("Vampire Diaries", Genre.ROMANTIC, "Candice", 50, "5.5star", 8, 3);
		WebSeriesDTO dto4 = new WebSeriesDTO("Vampire Diaries", Genre.ROMANTIC, "nina", 50, "5.5star", 8, 3);
		WebSeriesDTO dto5 = new WebSeriesDTO("Vampire Diaries", Genre.ROMANTIC, "Kat graham", 50, "5.5star", 8, 3);

		dao.save(dto1);
		dao.delete(3);
		dao.update(3, dto3);
		WebSeriesDTO[] dtos = dao.getWebSeries();
		dtos[0] = dto1;
		dtos[1] = dto2;
		dtos[2] = dto3;
		dtos[3] = dto4;
		dtos[4] = dto5;
		for (int i = 0; i < dtos.length; i++) {
			WebSeriesDTO dtos1 = dtos[i];

			if (dtos1 != null) {

				System.out.println(dtos1.getCast());
				System.out.println(dtos1.getCurrentSeason());
				System.out.println(dtos1.getName());
				System.out.println(dtos1.getNoofCharacters());
				System.out.println(dtos1.getRating());
				System.out.println(dtos1.getTotalSeasons());
			}

		}
	}

}
