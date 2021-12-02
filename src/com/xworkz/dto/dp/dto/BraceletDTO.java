package com.xworkz.dto;

public class BraceletDTO {

	private String colour;
	private float price;
	private String material;
	private boolean gemUsed;
	private boolean gifted;
	
	public BraceletDTO() {
		System.out.println("No argument constructor invoked");
	}
	public BraceletDTO(String colour, float price, String material, boolean gemUsed, boolean gifted) {
		super();
		this.colour = colour;
		this.price = price;
		this.material = material;
		this.gemUsed = gemUsed;
		this.gifted = gifted;
	}



	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isGemUsed() {
		return gemUsed;
	}

	public void setGemUsed(boolean gemUsed) {
		this.gemUsed = gemUsed;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}
	
}
