package com.xworkz.override.objectClasses;

public class Shoe {

	private String brand;
	private String colour;
	private char gender;
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		
		if(obj!=null) {
		if(obj instanceof Shoe) {
			Shoe shoe=(Shoe)obj;
			String shoe1=shoe.getBrand();
			String shoe2=shoe.getColour();
			if(this.brand.equals(shoe1) && this.colour.equals(shoe2)) {
				System.out.println("Colour and brand are matched");
				return true;
			}
			else {
				System.err.println("Not matched");
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
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
}
