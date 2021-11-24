package com.xworkz.interfaceprg;

public class ArrayAmazonCartDAO implements AmazonCartDAO{

	CartDTO[] dtos=new CartDTO[5];
	int count=0;
	
	@Override
	public boolean save(CartDTO cartDTO) {
		System.out.println("Invoked save method");
		this.dtos[this.count++]=cartDTO;
		if(count<dtos.length && cartDTO!=null) {
		System.out.println("Saved the Cart Dtos ".concat(String.valueOf(cartDTO.getPrice())));
		}
		else {
			System.err.println("Not saved");
		}
		return false;
	}
	
	@Override
	public CartDTO findByName(String name) {
		System.out.println("Invoked Find by Name");
		for (int i = 0; i < dtos.length; i++) {
			CartDTO cart=dtos[i];
			if( cart!=null &&name!=null ) {
				String name1=cart.getName();
				if(name1!=null ) {
					if(name.equals(name1)) {
					System.out.println("Finded by name ".concat(name1));
				}
				
				
			}else {
				System.err.println("Name is equal to null");
			}
			}else {
				System.err.println("Not founded name");
			}
		}
		return null;
		
	}
	@Override
	public void displayCartDetails() {
		System.out.println("Invoked Display Cart Details");
		for (int i = 0; i < dtos.length; i++) {
			CartDTO cart1=dtos[i];
			if(cart1!=null) {
				System.out.println(cart1.getItems());
				System.out.println(cart1.getName());
				System.out.println(cart1.getPrice());
				System.out.println(cart1.getQuantity());
			}else {
				System.out.println("Not Displayed");
			}
			
		}
		
	}
}
