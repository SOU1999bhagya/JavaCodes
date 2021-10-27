package com.xworkz.curd.Starter;

public class ResortOperator {
	String[] resortName = new String[3];
	private String location;
	private int count = 0;

	public ResortOperator() {
		this("Whitefield");
	}

	public ResortOperator(String location) {
		this.location = location;
	}

	public String getLocation() {
		return this.location;
	}

	public void addResortName(String name) {
		System.out.println("Resort Name: " + name);
		if (count < 4) {
			this.resortName[this.count] = name;
			this.count++;
		} else {
			System.out.println("Array full");
		}
	}

	public void displayResortName() {
		for (int i = 0; i < resortName.length; i++) {
			String nm = this.resortName[i];
			System.out.println(nm);
		}
	}
}
