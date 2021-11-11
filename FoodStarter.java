package com.xworkz.override;

import com.xworkz.override.objectClasses.Food;

public class FoodStarter {

	public static void main(String[] args) {

		Food food = new Food();
		String food1 = food.toString();
		System.out.println(food1);
		int food2 = food.hashCode();
		System.out.println(food2);
		
		Food food3=new Food();
		
		food.setName("Jolada Rotti");
		food3.setName("Jolada Rotti");
		
		System.out.println(food.equals(food3));
	}

}
