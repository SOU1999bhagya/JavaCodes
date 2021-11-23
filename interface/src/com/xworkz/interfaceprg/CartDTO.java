package com.xworkz.interfaceprg;

public class CartDTO {

	private String name;
	private int quantity;
	private float price;
	private int items;
	
	
	public CartDTO(String name, int quantity, float price, int items) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.items = items;
	}


	public String getName() {
		return name;
	}


	public int getQuantity() {
		return quantity;
	}


	public float getPrice() {
		return price;
	}


	public int getItems() {
		return items;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public void setItems(int items) {
		this.items = items;
	}
	
	
	
	
	
}
