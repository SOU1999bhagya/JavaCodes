package com.xworkz.override;

import com.xworkz.override.objectClasses.Fish;

public class FishStarter {

	public static void main(String[] args) {

		Fish fish = new Fish();

		String fish1 = fish.toString();
		System.out.println(fish1);
		int fish2 = fish.hashCode();
		System.out.println(fish2);
         
		Fish fish3=new Fish();
		
		fish.setColor("Grey");
		fish3.setColor("Grey");
		
		fish.setName("Bangda");
		fish3.setName("Bangda");
		
		System.out.println(fish.equals(fish3));
	}

}
