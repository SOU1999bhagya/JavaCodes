package com.xworkz.inherit.shop;

public class GoldFish extends Fish {

	public String color="gold";
	
	
	public GoldFish() {
		System.out.println("Invoked no argument constructor99999999");
		System.out.println();
	}
	public GoldFish(int size) {
		System.out.println("Invoked gold fish parameterised constructor-------".concat(String.valueOf(size)));
	}
	
}

