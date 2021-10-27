package com.xworkz.curd;

import com.xworkz.curd.Starter.ResortOperator;

public class ResortStarter {

	public static void main(String[] args) {
		ResortOperator restaurant = new ResortOperator();
		String loc = restaurant.getLocation();
		System.out.println(loc);
		restaurant.addResortName("Royal Galaxy");
		restaurant.addResortName("United Meadows");
		restaurant.addResortName("Hanging Out");
		restaurant.displayResortName();

	}

}
