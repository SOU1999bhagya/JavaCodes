package com.xworkz.curd;

import com.xworkz.curd.Starter.WaterFallOperator;

public class WaterFallStarter {

	public static void main(String[] args) {
		WaterFallOperator water = new WaterFallOperator();
		String loc = water.getState();
		System.out.println(loc);
		water.addWaterFullName("Shirley Falls");
		water.addWaterFullName("Amboli Falls");
		water.addWaterFullName("Jog Falls");
		water.displayWaterFallName();

	}

}
