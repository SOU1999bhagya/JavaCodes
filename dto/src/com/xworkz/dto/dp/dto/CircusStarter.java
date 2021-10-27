package com.xworkz.dto.dp.dto;

import com.xworkz.dto.dp.dao.CircusDAO;
import com.xworkz.dto.dp.dto.CircusDTO.*;
public class CircusStarter {

	public static void main(String[] args) {

		CircusDAO dao = new CircusDAO();
		CircusDTO dtos1 = new CircusDTO("Varha", 250.0f, 20, 4, 2.00f);
		CircusDTO dtos2 = new CircusDTO("Varudhini", 250.0f, 20, 4, 2.00f);
		CircusDTO dtos3 = new CircusDTO("Bhuvi", 250.0f, 20, 4, 2.00f);
		CircusDTO dtos4 = new CircusDTO("Harsha", 250.0f, 20, 4, 2.00f);
		CircusDTO dtos5 = new CircusDTO("Varha", 250.0f, 20, 4, 2.00f);

		dao.create(dtos1);
		dao.create(dtos2);
		dao.create(dtos3);
		dao.create(dtos4);
		dao.create(dtos5);
		
		dao.create(dtos3, 4);
		
		int occupy=dao.indexOccupied();
		System.out.println("Index Occupied: ".concat(String.valueOf(occupy)));
		
		System.out.println();
		
		boolean occupy1=dao.matchOwner("Harsha");
		System.out.println("Matched owner: ".concat(String.valueOf(occupy1)));
	}

}
