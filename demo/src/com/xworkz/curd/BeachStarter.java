package com.xworkz.curd;

import com.xworkz.curd.Starter.BeachOperator;

public class BeachStarter {

	public static void main(String[] args) {

		BeachOperator beach = new BeachOperator();

		String cname = beach.getCountryName();
		System.out.println("The Country name is " + cname);
		beach.addbeachName("Kundapura beach");
		beach.addbeachName("om beach");
		beach.addbeachName("Malpe Beach");
		beach.addbeachName("Baga Beach");
		beach.addbeachName("Armeedu Beach");
		beach.addbeachName("Calangute Beach");
		beach.displayBeachNames();
	}

}
