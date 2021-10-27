package com.xworkz.curd;

import com.xworkz.curd.Starter.IslandOperator;

public class IslandStarter {

	public static void main(String[] args) {
		IslandOperator island = new IslandOperator();
		String land = island.getCountry();
		System.out.println(land);
		island.addIslandName("Lakshadweep");
		island.addIslandName("Havelock");
		island.addIslandName("Majuli");
		island.displayIslandName();

	}

}
