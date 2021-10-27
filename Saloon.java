package com.xworkz.inherit.shop;

public class Saloon {

	public String name;
	
	public Saloon() {
		this("Unisex saloon");
		System.out.println("Invoked no argument constructor");
	}
	
	public Saloon(String name) {
		System.out.println("Invoked parameterised constructor");
	}
}
