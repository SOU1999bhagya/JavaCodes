package com.xworkz.dto.dp;

import com.xworkz.dto.CarpenterDTO;

public class CarpenterStarter {

	public static void main(String[] args) {
		CarpenterDTO carpenter=new CarpenterDTO();
		carpenter.setAge(42);
		carpenter.setCarpenterName("Akshi");
		carpenter.setExperience(4);
		carpenter.setSalary(20000d);
		carpenter.setWork("Cutting");
		
		CarpenterDTO carpenter1=new CarpenterDTO("Varshi", 43, 13000d, "Finishing",3 );
		CarpenterDTO carpenter2=new CarpenterDTO("teji", 43, 13000d, "Finishing",3 );
		CarpenterDTO carpenter3=new CarpenterDTO("anu", 43, 13000d, "Finishing",3 );
		CarpenterDTO carpenter4=new CarpenterDTO("Varshi", 43, 13000d, "Finishing",3 );
		
		CarpenterDTO[] dto=new CarpenterDTO[5];
		dto[0]=carpenter1;
		dto[1]=carpenter2;
		dto[3]=carpenter3;
		dto[4]=carpenter4;
		
		for(int i=0;i<dto.length;i++) {
			CarpenterDTO dto1=dto[i];
			if(dto1!=null) {
				System.out.println(dto1.getAge());
				System.out.println(dto1.getCarpenterName());
				System.out.println(dto1.getExperience());
				System.out.println(dto1.getSalary());
				System.out.println(dto1.getWork());
			}
			else {
				
			System.err.println("index is not pointing to null".concat(String.valueOf(i)));	
			}
		}

	}

}
