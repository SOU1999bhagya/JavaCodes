package com.xworkz.curd.Starter;

public class BeachOperator {

	private String[] beachNames = new String[5];
	private String countryName;
	private int counter = 0;

	public BeachOperator() {
		this("India");
		System.out.println("Invoked Beach Operator");
	}

	public BeachOperator(String countryName) {
		this.countryName = countryName;
		System.out.println("Invoked with argument constructor");
	}
F
	public String getCountryName() {
		return this.countryName;
	}

	public void addbeachName(String name) {

		System.out.println("Name of the beach is " + name);
		if (this.counter < 5) {
			this.beachNames[this.counter] = name;
			this.counter++;

		} else {
			System.out.println("The array is full");
		}
	}

	public void displayBeachNames() {

		System.out.println("Invoked display beach names");
		for (int i = 0; i < this.beachNames.length; i++) {
			String name = this.beachNames[i];
			System.out.println(name);
		}
	}
}
