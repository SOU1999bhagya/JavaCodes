package com.xworkz.override.objectClasses;

import com.xworkz.override.objectClasses.constants.Type2;

public class Plant {

	private String name;
	private boolean alive;
	private int lifeSpan;
	private Type2 type;
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() of Object");
		return "Super";//super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() of Object");
		return  10;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj!=null) {
			if(obj instanceof Plant) {
				Plant plant=(Plant)obj;
				String plant1=plant.getName();
				Type2 plant2=plant.getType();
				if(this.name.equals(plant1) && this.type.equals(plant2)) {
					System.out.println("The name and type is matched");
					return true;
				}
				
				else {
					System.out.println("Not Matched");
				}
				
			}
			
			
		}
		return false;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setType(Type2 type) {
		this.type = type;
	}
	
	public Type2 getType() {
		return type;
	}
	
}
