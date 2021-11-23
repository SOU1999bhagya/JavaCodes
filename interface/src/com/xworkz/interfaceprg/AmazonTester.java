package com.xworkz.interfaceprg;

public class AmazonTester {

	public static void main(String[] args) {
		
		CartDTO dto=new CartDTO("Shampoo", 2, 500.0f, 3);

		ArrayAmazonCartDAO dao=new ArrayAmazonCartDAO();
		
		dao.save(dto);
		System.out.println();
		System.out.println();
		
		dao.findByName("Shampoo");
		System.out.println();
		System.out.println();
		
		dao.displayCartDetails();
		
		AmazonBusiness business=new AmazonBusiness();
		
		business.saveCart(dto);
		
		business.findCartByName(dto);
		
		business.displayCart();
	}

}
