package com.xworkz.dto.dp;

import com.xworkz.dto.BusDriverDTO;

public class BusDriverStarter {

	public static void main(String[] args) {
		
		BusDriverDTO driver=new BusDriverDTO();
		driver.setBusName("KSRTC");
		driver.setDriverName("Varsha");
		driver.setExperience(5);
		driver.setPlace("BTM");
		driver.setSalary(20000d);
		
		BusDriverDTO driver1=new BusDriverDTO("Akshi", 6, 15000d, "Bendre", "Silkboard");
		BusDriverDTO driver2=new BusDriverDTO("Raju", 6, 15000d, "Bendre", "Silkboard");
		BusDriverDTO driver3=new BusDriverDTO("Anusha", 6, 15000d, "Bendre", "Silkboard");
		BusDriverDTO driver4=new BusDriverDTO("Anita", 6, 15000d, "Bendre", "Silkboard");
		
		BusDriverDTO[] dto=new BusDriverDTO[5];
		dto[0]=driver1;
		dto[2]=driver2;
		dto[3]=driver3;
		dto[4]=driver4;
		
		for(int i=0;i<dto.length;i++) {
			BusDriverDTO dto1=dto[i];
			if(dto1!=null) {
			System.out.println(dto1.getBusName());
			System.out.println(dto1.getDriverName());
			System.out.println(dto1.getExperience());
			System.out.println(dto1.getPlace());
			System.out.println(dto1.getSalary());
		}
			else {
				System.err.println("Index is not pointing to null".concat(String.valueOf(i)));
			}

	}

}
}