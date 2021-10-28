package com.xworkz.inherit;

import com.xworkz.inherit.shop.Factory;
import com.xworkz.inherit.shop.SugarFactory;

public class FactoryStarter {

	public static void main(String[] args) {
		Factory factory=new Factory();
        Factory factory1=new SugarFactory();
        
        Object obj=new SugarFactory("chair");
	}

}
