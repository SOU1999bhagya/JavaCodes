package com.xworkz.curd;

import com.xworkz.curd.Starter.ChocolateOperator;

public class ChocolateStarter {

	public static void main(String[] args) {
		ChocolateOperator chocolateOperator = new ChocolateOperator();
		String choci = chocolateOperator.getBrand();
		System.out.println(choci);
		chocolateOperator.addChocoName("Eclairs");
		chocolateOperator.addChocoName("Melody");
		chocolateOperator.addChocoName("Perk");
		chocolateOperator.addChocoName("Snickers");
		chocolateOperator.addChocoName("Walnut");

	}

}
