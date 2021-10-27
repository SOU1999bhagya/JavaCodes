package com.xworkz.curd.Starter;

public class GinOperator {
	String[] ing = new String[3];
	private String est;
	private int count = 0;

	public GinOperator() {
		this("11th Century AD");
	}

	public GinOperator(String est) {
		this.est = est;
	}

	public String getEst() {
		return this.est;
	}

	public void addingredients(String name) {
		System.out.println("The ingredients are " + name);
		if (count < 4) {
			this.ing[this.count] = name;
			this.count++;
		} else {
			System.out.println("Array full");
		}
	}

	public void displayingredients() {
		for (int i = 0; i < ing.length; i++) {
			String nm = this.ing[i];
			System.out.println(nm);
		}
	}
}
