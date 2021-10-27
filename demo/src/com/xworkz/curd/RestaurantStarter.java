package com.xworkz.curd;

import com.xworkz.curd.Starter.RestaurantOperator;

public class RestaurantStarter {

	public static void main(String[] args) {
		RestaurantOperator restaurant = new RestaurantOperator();
		String res = restaurant.getLocation();
		System.out.println(res);
		restaurant.addRestaurantName("Paradize");
		restaurant.addRestaurantName("Jitley");
		restaurant.addRestaurantName("Roti Ghar");
		restaurant.displayRestaurantName();
	}

}
