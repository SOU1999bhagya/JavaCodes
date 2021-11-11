package com.xworkz.override;

import com.xworkz.override.objectClasses.Icecream;
import com.xworkz.override.objectClasses.constants.Flavour;
import com.xworkz.override.objectClasses.constants.IceCreamType;

public class IceCreamStarter {

	public static void main(String[] args) {

		Icecream cream = new Icecream();

		String cream1 = cream.toString();
		System.out.println(cream1);
		int cream2 = cream.hashCode();
		System.out.println(cream2);

		Icecream cream3=new Icecream();
		
		cream3.setFlavour(Flavour.BUTTERSCOTCH);
		cream.setFlavour(Flavour.BUTTERSCOTCH);
		
		
		cream.setType(IceCreamType.CONE);
		cream3.setType(IceCreamType.CONE);
		
		System.out.println(cream.equals(cream3));
		
	}

}
