package com.xworkz.inherit.shop;

public class Fish {

	public String region="goa";
	
	
	
	public Fish() {
		
		System.out.println("Invoked no argument constructor//////");
		System.out.println();
	}
	
	public Fish(String region,boolean alive) {
		super();//it is used initialize the variables from parent class
		System.out.println("Invoked parameterised constructor*******".concat(String.valueOf(region)));
		System.out.println();
	}
}
