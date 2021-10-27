package com.xworkz.inherit;

import com.xworkz.inherit.shop.NaturalSaloon;
import com.xworkz.inherit.shop.Saloon;

public class SaloonStarter {

	public static void main(String[] args) {
		Saloon saloon=new Saloon();
		System.out.println("The name of the saloon ".concat(saloon.name));
		NaturalSaloon naturalSaloon=new NaturalSaloon();
		System.out.println("The no of Hajamas ".concat(String.valueOf(naturalSaloon.noofHajamas)));
        System.out.println("The name of the saloon ".concat(naturalSaloon.name));
        Saloon saloon1=new NaturalSaloon();
       System.out.println("The name of the saloon ".concat(saloon1.name));
	}

}
