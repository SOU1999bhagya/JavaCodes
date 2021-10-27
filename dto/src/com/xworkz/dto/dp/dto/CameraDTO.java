package com.xworkz.dto.dp.dto;

public class CameraDTO {

	private String companyName;
	private String type;
	private float pixel;
	private int price;
	
	public CameraDTO() {
		System.out.println("Invoked no argument constructor");
	}

	public CameraDTO(String companyName, String type, float pixel, int price) {
		super();
		this.companyName = companyName;
		this.type = type;
		this.pixel = pixel;
		this.price = price;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getType() {
		return type;
	}

	public float getPixel() {
		return pixel;
	}

	public int getPrice() {
		return price;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPixel(float pixel) {
		this.pixel = pixel;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
