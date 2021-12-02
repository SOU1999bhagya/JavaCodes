package com.xworkz.dto.dp.dto;

public class MilkCanDTO 
{

	private Integer quantity;
	private String shape;
	private boolean quality;
	private float price;
	
	public MilkCanDTO()
	{
    System.out.println("Invoked no argument constructor");
	}

	public MilkCanDTO(Integer quantity, String shape, boolean quality, float price) {
		super();
		this.quantity = quantity;
		this.shape = shape;
		this.quality = quality;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public String getShape() {
		return shape;
	}

	public boolean isQuality() {
		return quality;
	}

	public float getPrice() {
		return price;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
