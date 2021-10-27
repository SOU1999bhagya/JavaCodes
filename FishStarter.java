package com.xworkz.inherit;

import com.xworkz.inherit.shop.Fish;
import com.xworkz.inherit.shop.GoldFish;
import com.xworkz.inherit.shop.SharkFish;

public class FishStarter {

	public static void main(String[] args) {
		Fish fish=new Fish("Mangalore",true);
		System.out.println(fish.region);
		SharkFish shark=new SharkFish();
		System.out.println("The region of literal region name ".concat(String.valueOf(shark.region)));
		System.out.println();
		System.out.println("height of shark".concat(String.valueOf(shark.height)));
		GoldFish gold=new GoldFish(10);
		System.out.println("The color of gold fish is ".concat(gold.color));
		

	}

}
