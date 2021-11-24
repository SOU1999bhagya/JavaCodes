package com.xworkz.interfaceprg;

public class BirdTester {

	public static void main(String[] args) {
		
		BirdDTO dto=new BirdDTO("FNJE778", "crane", 15, "US" );
		BirdDTO dto1=new BirdDTO("bjhjh787", "Pigeaon", 8, "Canada");
		
		
		AssociateBird bird=new AssociateBird();
		
		bird.fly(dto1);
		
		bird.eat(null);
		
		bird.swim(dto);

	}

}
