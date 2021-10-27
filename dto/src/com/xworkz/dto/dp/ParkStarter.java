package com.xworkz.dto.dp;

import com.xworkz.dto.ParkDTO;

public class ParkStarter {

	public static void main(String[] args) {
		ParkDTO park=new ParkDTO();
		park.setHoliday("sunday");
		park.setLocation("BTM");
		park.setNoofBenches(30);
		park.setParkName("Kuvempu");
		park.setTimings("4.00 am to 4.00PM");
		
		ParkDTO park1=new ParkDTO("gvh", "BTM", "4.00 am", 34, "kuvempy");
		ParkDTO park2=new ParkDTO("gvh", "BTM", "4.00 am", 34, "kuvempy");
		ParkDTO park3=new ParkDTO("gvh", "BTM", "4.00 am", 34, "kuvempy");
		ParkDTO park4=new ParkDTO("gvh", "BTM", "4.00 am", 34, "kuvempy");
		
		ParkDTO[] dto=new ParkDTO[5];
		dto[0]=park1;
		dto[2]=park2;
		dto[3]=park3;
		dto[4]=park4;
		
		for(int i=0;i<dto.length;i++) {
			ParkDTO dto1=dto[i];
			if(dto1!=null) {
				System.out.println(dto1.getHoliday());
				System.out.println(dto1.getLocation());
				System.out.println(dto1.getNoofBenches());
				System.out.println(dto1.getParkName());
				System.out.println(dto1.getTimings());
				}
			else {
				System.err.println("Index is pointing to null".concat(String.valueOf(i)));
			}
		}
		
		

	}

}
