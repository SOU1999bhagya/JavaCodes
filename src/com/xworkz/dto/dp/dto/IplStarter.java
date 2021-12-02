package com.xworkz.dto.dp.dto;

import com.xworkz.dto.dp.dao.IplDAO;

public class IplStarter {

	public static void main(String[] args) {
		
		IplDAO dao=new IplDAO();
		
		
		IplDTO dto1=new IplDTO(30, 24, "Diego", "vivo", "RCB");
		IplDTO dto2=new IplDTO(14, 24, "Ambani", "pulsar", "MI");
		IplDTO dto3=new IplDTO(15, 24, "KF", "fiat", "SRH");
		IplDTO dto4=new IplDTO(16, 24, "Vijay", "puma", "KXIP");
		IplDTO dto5=new IplDTO(17, 24, "Varsha", "intel", "KKR");
		
		dao.create(dto1);
		dao.create(dto2);
		dao.create(dto3);
		dao.create(dto4);
		dao.create(dto5);
		dao.create(dto3, 4);
		
		System.out.println();
		dao.create(new IplDTO(29, 24, "Diego", "vivo", "KKR"), 3);
	
		int occupy=dao.indexOccupied();
		System.out.println("Index Occupied: ".concat(String.valueOf(occupy)));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		boolean match=dao.matchOwner("Diego");
		System.out.println("The owner name is matched ".concat(String.valueOf(match)));
	}

}
