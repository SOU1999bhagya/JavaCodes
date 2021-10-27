package com.xworkz.curd.Starter;

public class WaterFallOperator {
	String[] waterFallname = new String[3];
	private String state;
	private int count = 0;

	public WaterFallOperator() {
		this("Karnataka");
	}

	public WaterFallOperator(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void addWaterFullName(String name) {
		System.out.println("WaterFull: " + name);
		if (count < 4) {
			this.waterFallname[this.count] = name;
			this.count++;
		} else {
			System.out.println("Array full");
		}
	}

	public void displayWaterFallName() {
		for (int i = 0; i < waterFallname.length; i++) {
			String nm = this.waterFallname[i];
			System.out.println(nm);
		}
	}

}
