package com.xworkz.curd.Starter;

public class RestaurantOperator {
	String[] restaurantName = new String[3];
	private String location;
	private int count = 0;

	public RestaurantOperator() {
		this("BTM Layout");
	}

	public RestaurantOperator(String location) {
		this.location = location;
	}

	public String getLocation() {
		return this.location;
	}

	public void addRestaurantName(String name) {
		System.out.println("Restaurant Name:" + name);
		if (count < 4) {
			this.restaurantName[this.count] = name;
			this.count++;
		} else {
			System.out.println("Array full");
		}
	}

	public void displayRestaurantName() {
		for (int i = 0; i < this.restaurantName.length; i++) {
			String nm = this.restaurantName[i];
			System.out.println(nm);
		}
	}
}
