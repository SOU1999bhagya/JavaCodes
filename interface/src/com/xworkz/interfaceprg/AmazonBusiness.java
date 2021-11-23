package com.xworkz.interfaceprg;

public class AmazonBusiness {
	
	private AmazonCartDAO dao;

	public void saveCart(CartDTO cto) {
		System.out.println("Invoked Save Cart of Amazon Business");
		boolean save=this.dao.save(cto);
		if(save && cto!=null) {
			System.out.println("Saved where we hide the implementation");
		}else {
			System.err.println("Not saved in Amazon Business");
		}
	}
	
	
	public void findCartByName(CartDTO cto) {
		System.out.println("Invoked Find By Name of Amazon Business");
		CartDTO dto=this.dao.findByName("Shampoo");
		if(dto!=null && cto!=null) {
			System.out.println("Finded By Name where we hide implementation");
			}
		else {
			System.err.println("Not finded name in Amazon Business");
		}
		
	}
	
	
	public void displayCart() {
		System.out.println("Invoked Display Cart of Amazon Business");
	     this.dao.displayCartDetails();
	     System.out.println("Displayed all details where we hide implementation");
	}
	
}
