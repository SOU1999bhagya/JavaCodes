package com.xworkz.dto.dp;


import com.xworkz.dto.dp.dao.MilkCanDAO;
import com.xworkz.dto.dp.dto.MilkCanDTO;



public class MilkCanStarter {

	public static void main(String[] args) {
		MilkCanDAO dao=new MilkCanDAO();
		
		MilkCanDTO dtos1=new MilkCanDTO(20, "Oval", true, 250.5f);
		MilkCanDTO dtos2=new MilkCanDTO(20, "Oval", true, 250.5f);
		MilkCanDTO dtos3=new MilkCanDTO(20, "Oval", true, 250.5f);
		MilkCanDTO dtos4=new MilkCanDTO(20, "Oval", true, 250.5f);
		MilkCanDTO dtos5=new MilkCanDTO(20, "Oval", true, 250.5f);
		
		dao.create(dtos1);
		dao.create(dtos2);
		dao.create(dtos3);
		dao.create(dtos4);
		dao.create(dtos5);
		dao.create(dtos5, 4);
		
		int occupy=dao.indexOccupied();
		System.out.println("Index Occupied: ".concat(String.valueOf(occupy)));
		System.out.println();
		boolean occupy1=dao.matchShape("Oval");
		System.out.println("Matched: ".concat(String.valueOf(occupy1)));
	}

}
