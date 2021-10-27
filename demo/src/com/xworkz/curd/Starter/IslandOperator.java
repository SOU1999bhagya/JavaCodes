package com.xworkz.curd.Starter;

public class IslandOperator {
	String[] islandName = new String[3];
	private String country;
	private int count = 0;

	public IslandOperator() {
		this("India");
	}

	public IslandOperator(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void addIslandName(String name) {
		System.out.println("Island Name:" + name);
		if (count < 4) {
			this.islandName[this.count] = name;
			this.count++;
		} else {
			System.out.println("Array full");
		}
	}

	public void displayIslandName() {
		for (int i = 0; i < islandName.length; i++) {
			String nm = this.islandName[i];
			System.out.println(nm);
		}
	}

}
