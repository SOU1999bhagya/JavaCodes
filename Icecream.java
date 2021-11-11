package com.xworkz.override.objectClasses;

import com.xworkz.override.objectClasses.constants.Flavour;
import com.xworkz.override.objectClasses.constants.IceCreamType;

public class Icecream {

	private String name;
	private Flavour flavour;
	private IceCreamType type;
	
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() of Object");
		return "amul";//super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() of Object");
		return 20;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj==null) {
			System.out.println("Object to null");
			
		}
			if(obj instanceof Icecream) {
				Icecream cream=(Icecream)obj;
				Flavour flavour=cream.getFlavour();
				IceCreamType cream1=cream.getType();
				if(this.flavour.equals(flavour) && this.type.equals(cream1)) {
					
					System.out.println("Matched flavour and type");
					return true;
					
				}
				
				
				else {
					System.out.println("Not matched");
				}
				
				
				
			}
			
			
			
			
		
		return false;
	}
	
	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}
	
	public Flavour getFlavour() {
		return flavour;
	}
	
	public void setType(IceCreamType butterscotch) {
		this.type = butterscotch;
	}
	
	public IceCreamType getType() {
		return type;
	}
}
