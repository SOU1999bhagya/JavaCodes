package com.xworkz.override.objectClasses;

import com.xworkz.override.objectClasses.constants.Type1;

public class HeadSet {

	private String brand;
	private Type1 type;
	private double volt;
	private int warranty;
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() of Object");
		return  "Sou";//super.toString();
	}
	
	@Override
	public int hashCode() {
	System.out.println("");
		return 300;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj==null) {
			System.out.println("Object is equals to null");
			
		}
			if(obj instanceof HeadSet) {
				HeadSet head=(HeadSet)obj;
				String head1=head.getBrand();
				Type1 head2=head.getType();
				if(this.brand.equals(head1) && this.type.equals(head2)) {
					System.out.println("The brand and type is matched ");
					return true;	
				}
				else {
					System.out.println("The brand and type is not matched");
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
	
	public void setType(Type1 type) {
		this.type = type;
	}
	
	public Type1 getType() {
		return type;
	}
}
