package com.xworkz.dto.dp;


import com.xworkz.dto.dp.dao.TempleDAO;
import com.xworkz.dto.dp.dto.TempleDTO;


public class TempleStarter {

	public static void main(String[] args) {
		TempleDTO dto=new TempleDTO();
		TempleDAO dao=new TempleDAO();
		 
		TempleDTO dto1=new TempleDTO("Kalikamba", "BTM", "Kalimatha", true, 10.00f);
		TempleDTO dto2=new TempleDTO("Banashankari", "Banashankari", "Kalimatha", true, 10.00f);
		TempleDTO dto3=new TempleDTO("Kalikamba", "BTM", "Kalimatha", true, 10.00f);
		TempleDTO dto4=new TempleDTO("Hanumantha", "Silkboard", "Hanumanta", true, 10.00f);
		TempleDTO dto5=new TempleDTO("Kalikamba", "BTM", "Kalimatha", true, 10.00f);
		
		dao.save(dto2);
		dao.delete(3);
		dao.update(4, dto4);
		
		TempleDTO[] dtos=dao.getTempleDTOs();
		dtos[0]=dto1;
		dtos[1]=dto2;
		dtos[3]=dto3;
		dtos[4]=dto4;
		dtos[5]=dto5;
		for(int i=0;i<dtos.length;i++) {
			TempleDTO temple=dtos[i];
			if(temple!=null) {
				System.out.println(temple.getLocation());
				System.out.println(temple.getMainGod());
				System.out.println(temple.getName());
				System.out.println(temple.getYestgante());
				System.out.println(temple.isPrasada());
			}
			else {
				System.err.println("The array is full");
			}
		}
		}

		
	}


