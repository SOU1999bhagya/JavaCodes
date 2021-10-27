package com.xworkz.dto.dp;

import com.xworkz.dto.CraneDTO;

public class CraneStarter {

	public static void main(String[] args) {
		CraneDTO crane=new CraneDTO();
		crane.setName("Sarus crane");
		crane.setHeight("1.8m");
		crane.setWeight(5.9f);
		crane.setType("Flying Bird");
		crane.setForest("Bannerghatta");
		crane.setColor("Grey Plumage");
		crane.setBabies(true);
		
		CraneDTO crane1=new CraneDTO("Tower crane","265feet" ,19.8f,"flying","Charmudi", false,"yellow");
		CraneDTO crane2=new CraneDTO("White naped crane","1.5m",8.9f,"flying","Nandi" , true, null);
		CraneDTO crane3=new CraneDTO("Parrot", "13feet", 12.0f, "flying", "Akasha", false, "pink");
		CraneDTO crane4=new CraneDTO("Peacock", "2.3m", 14.5f,"flying","Agadi", true, null);
		
		CraneDTO[] bird=new CraneDTO[7];
		
		bird[0]=crane1;
		bird[3]=crane3;
		bird[1]=crane2;
		bird[4]=crane4;
		
		for(int i=0;i<bird.length;i++) {
			CraneDTO ok=bird[i];
			if(ok!=null) {
			System.out.println(ok.getColor());
			System.out.println(ok.getForest());
			System.out.println(ok.getHeight());
			System.out.println(ok.getName());
			System.out.println(ok.getWeight());
			System.out.println(ok.getType());
			System.out.println(ok.isBabies());	
		}
		
	
		else {
			System.out.println("Index is not pointing to null".concat(String.valueOf(i)));
		}

}
}
}
