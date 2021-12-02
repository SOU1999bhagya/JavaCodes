package com.xworkz.dto.dp.dto;

public class DressCodeDTO {

	private float size;
	private String material;
	private String color;
	private float price;
	private char gender;
	
	public DressCodeDTO() {
		System.out.println("invoked no argument constructor");
	}

	public DressCodeDTO(float size, String material, String color, float price, char gender) {
		super();
		this.size = size;
		this.material = material;
		this.color = color;
		this.price = price;
		this.gender = gender;
	}

	public float getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	public float getPrice() {
		return price;
	}

	public char getGender() {
		return gender;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
