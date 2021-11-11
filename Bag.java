package com.xworkz.override.objectClasses;

import com.xworkz.override.objectClasses.constants.Type3;

public class Bag {

	private float price;
	private Type3 type;
	private int sections;
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() of Object");
		return "sou";//super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() of Object");
		return 45;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj!=null) {
			System.out.println();
			return true;
		}
			if(obj instanceof Bag) {
				Bag bag=(Bag)obj;
				Type3 bag1=bag.getType();
				if(this.type.equals(bag1)) {
					System.out.println("Type is matched");
					
				}
				else {
					System.out.println("Not matched");
				}
			}
			
			
		
		
		
		
		return false;
	}
	
	public Type3 getType() {
		return type;
	}
	
	public void setType(Type3 type) {
		this.type = type;
	}
	
}
