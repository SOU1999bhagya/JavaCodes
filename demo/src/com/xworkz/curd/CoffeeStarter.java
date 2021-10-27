package com.xworkz.curd;

import com.xworkz.curd.Starter.CoffeOperator;

public class CoffeeStarter {

	public static void main(String[] args) {
		CoffeOperator drink=new CoffeOperator();
		drink.addBrand("Bru");
		drink.addBrand("Nescafe");
		drink.addBrand("Levista");
		drink.addBrand("Mcafe");
		drink.deleteReference(8);
		drink.UpdateWork(3,null);
		drink.displayBrand();

	}

}
