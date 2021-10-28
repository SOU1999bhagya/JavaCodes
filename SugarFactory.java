package com.xworkz.inherit.shop;

public class SugarFactory extends Factory{

       public SugarFactory() {
		super(1965);
		System.out.println("Invoked no-args constructor of Sugar Factory");
		System.out.println();
	}
	public SugarFactory(String product) {
		this.product=product;
		System.out.println("Invoked parameterised constructor of Sugar Factory".concat(product));
		System.out.println();
	}
}
