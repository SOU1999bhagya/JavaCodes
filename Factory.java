package com.xworkz.inherit.shop;

public class Factory {

	private String name;
	public String product;
	private int since;
	
	public Factory() {
		
		System.out.println("Invoked no-args constructor........");
	}
	
	public Factory(int since) {
		this.since=since;
		System.out.println("Invoked parameterised constructor of factory________");
		System.out.println("The Factory is since at ".concat(String.valueOf(since)));
		System.out.println();
	}
}
