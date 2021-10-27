package com.xworkz.curd;

import com.xworkz.curd.Starter.GinOperator;

public class GinStarter {

	public static void main(String[] args) {
		GinOperator gin = new GinOperator();
		String num = gin.getEst();
		System.out.println(num);
		gin.addingredients("Alcohol");
		gin.addingredients("grain");
		gin.addingredients("Barley");
		gin.displayingredients();
	}
}
