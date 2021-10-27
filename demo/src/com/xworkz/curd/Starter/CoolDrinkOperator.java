package com.xworkz.curd;

public class CoolDrinkOperator {

	private String[] brandName = new String[7];
	private int army = 0;

	public void addBrand(String name) {
		System.out.println("Brand Name:".concat(name));
		System.out.println("Army:".concat(String.valueOf(this.army)));
		if (army < this.brandName.length) {
			this.brandName[this.army++] = name;
		} else {
			System.err.println("The array is full".concat(String.valueOf(this.army)));
		}
	}

	public void displayBrandNames() {
		for (int i = 0; i < brandName.length; i++) {
			System.out.println("display:".concat(String.valueOf(this.brandName[i])));

		}
	}

	public void deleteReference(int index) {
	
		if (index >= 0 && index <=brandName.length) {
			this.brandName[index] = null;
			System.out.println("Deleting the Reference:".concat(String.valueOf(this.brandName)));

		} else {
			System.err.println("index is deleted:".concat(String.valueOf(this.army)));
		}

	}
	public void UpdateBrand(int index, String nothing) {
		if (index>= 0 && index < brandName.length && nothing!=null) {
			this.brandName[index]=nothing;
System.out.println("Updating value:".concat(String.valueOf(index)));

		}
		else {
			System.err.println("canoot be updated:");
		}
	}
}
