package com.xworkz.curd.Starter;

public class ChocolateOperator {

	private String[] chocoName = new String[5];
	private String brand;
	private int count = 0;

	public ChocolateOperator() {
		this("Parle");
		System.out.println("Invoked Chocolate Operator");
	}

	public ChocolateOperator(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void addChocoName(String name) {

		System.out.println("Chocolate name:" + name);
		if (count < 5) {
			this.chocoName[this.count] = name;
			count++;
		} else {
			System.out.println("The array is full");
		}
	}

	public void displayChocoName() {
		for (int i = 0; i < this.chocoName.length; i++) {
			String name = this.chocoName[i];
			System.out.println(name);
		}

	}

}
