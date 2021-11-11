package com.xworkz.override;

import com.xworkz.override.objectClasses.Bag;
import com.xworkz.override.objectClasses.constants.Type3;

public class BagStarter {

	public static void main(String[] args) {
		
		Bag bag=new Bag();
		
		String bag1=bag.toString();
		System.out.println(bag1);
		
		int bag2=bag.hashCode();
		System.out.println(bag2);
		
		Bag bag3=new Bag();
		
		bag.setType(Type3.CARRYBAG);
		bag3.setType(Type3.CARRYBAG);
		
		System.out.println(bag.equals(bag3));

	}

}
