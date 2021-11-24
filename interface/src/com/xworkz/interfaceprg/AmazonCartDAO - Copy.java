package com.xworkz.interfaceprg;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String name);

	void displayCartDetails();
}
