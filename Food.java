package com.xworkz.override.objectClasses;

public class Food {

	private String name;
	private int price;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "str";//super.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj!=null) {
			if(obj instanceof Food) {
				Food food=(Food)obj;
				String food1=food.getName();
				if(this.name.equals(food1)) {
					System.out.println("Name is matched");
					return true;
				}
				else {
					System.err.println("Not matched");
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
}
