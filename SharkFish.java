package com.xworkz.inherit.shop;

public class SharkFish extends Fish {

	public float height=5.6f;
	
	
	public SharkFish() {
		this(49);
		System.out.println("Invoked no argument constructor$$$$$$$$");
		System.out.println();
	}
	public SharkFish(int weight) {
		
		System.out.println("invoked parameterised constructor+++++++".concat(String.valueOf(weight)));
	}
}
