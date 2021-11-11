package com.xworkz.override;

import com.xworkz.override.objectClasses.Plant;
import com.xworkz.override.objectClasses.constants.Type2;

public class PlantStarter {

	public static void main(String[] args) {
	
		Plant plant=new Plant();
		
		String plant1=plant.toString();
		System.out.println(plant1);
		int plant2=plant.hashCode();
		System.out.println(plant2);
		
		Plant plant3=new Plant();
		
		plant.setName("Brundavana");
		plant3.setName("Brundavana");
		
		plant3.setType(Type2.ELECTRIC);
		plant.setType(Type2.ELECTRIC);
		
		System.out.println(plant.equals(plant3));
		
	}

}
