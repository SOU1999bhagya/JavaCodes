package com.xworkz.curd.Starter;

import com.xworkz.curd.CoolDrinkOperator;

public class CoolDrinkStarter {

	public static void main(String[] args) {
		CoolDrinkOperator drink=new CoolDrinkOperator();
		drink.addBrand("Dew");
		drink.addBrand("Pepsi");
		drink.addBrand("Mirinda");
		drink.addBrand("Sting");
		drink.addBrand("Fanta");
		drink.addBrand("Slice");
		drink.addBrand("Frooti");	
		drink.deleteReference(8);
		drink.UpdateBrand(3,null);
		drink.displayBrandNames();	
	}
}
