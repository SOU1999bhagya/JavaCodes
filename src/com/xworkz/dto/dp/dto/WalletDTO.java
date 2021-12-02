package com.xworkz.dto.dp.dto;

public class WalletDTO {

	private String companyName;
	private String material;
	private int totalCompartments;
	private float price;
	private int coinCompartment;
	
	public WalletDTO() {
		System.out.println("Invoked no argument constructor");
	}

	public WalletDTO(String companyName, String material, int totalCompartments, float price, int coinCompartment) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.totalCompartments = totalCompartments;
		this.price = price;
		this.coinCompartment = coinCompartment;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getMaterial() {
		return material;
	}

	public int getTotalCompartments() {
		return totalCompartments;
	}

	public float getPrice() {
		return price;
	}

	public int getCoinCompartment() {
		return coinCompartment;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setTotalCompartments(int totalCompartments) {
		this.totalCompartments = totalCompartments;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setCoinCompartment(int coinCompartment) {
		this.coinCompartment = coinCompartment;
	}
	
}
