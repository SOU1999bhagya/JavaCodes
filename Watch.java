package com.xworkz.override.objectClasses;

import com.xworkz.override.objectClasses.constants.Type;

public class Watch {

	private String brand;
	private Type type;
	private int price;
	
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() of Object");
		return "redMe";//super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() of Object");
		return  200;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj!=null) {
			System.out.println("Object is equals to null");
			if(obj instanceof Watch) {
				Watch casted=(Watch)obj;
				String ref5=casted.getBrand();
				Type ref6=casted.getType();
				
				if(this.brand.equals(ref5) && this.type.equals(ref6)) {
					System.out.println("The brand and type are matched ");
					return true;
				}
				else {
					System.out.println("The brand is not matched");
				}
				
			}	
		}
		
		
		return false;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	
	
	
}
