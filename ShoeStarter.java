package com.xworkz.override;

import com.xworkz.override.objectClasses.Shoe;

public class ShoeStarter {

	public static void main(String[] args) {
		
		Shoe shoe=new Shoe();
		
		Shoe shoe2=new Shoe();
		
		shoe.setBrand("puma");
		shoe2.setBrand("puma");
		
		shoe.setColour("red");
		shoe2.setColour("red");
		System.out.println(shoe.equals(shoe2));
		
		
	}

}
