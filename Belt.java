package com.xworkz.override.objectClasses;

public class Belt {

	private int price;
	private String material;
	private char gender;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "girl";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 99;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of object");
		if (obj != null) {
			if (obj instanceof Belt) {
				Belt belt = (Belt) obj;
				String belt1 = belt.getMaterial();
				if (this.material.equals(belt1)) {
					System.out.println("Material is matched");
					return true;
				}
				else {
					System.err.println("Not matched");
				}
			}

		}
		return false;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}
}
