package com.xworkz.interfaceprg.interfacestarter;

import com.xworkz.interfaceprg.AssociateBird;
import com.xworkz.interfaceprg.BirdDTO;
import com.xworkz.interfaceprg.ImplentationOfbrdDAO;

public class BirdTester {

	public static void main(String[] args) {

		BirdDTO dto = new BirdDTO("FNJE778", "crane", 15, "US");
		BirdDTO dto1 = new BirdDTO("bjhjh787", "Pigeaon", 8, "Canada");

		ImplentationOfbrdDAO implentationOfBirdDAO = new ImplentationOfbrdDAO();
		AssociateBird bird = new AssociateBird(implentationOfBirdDAO);

		implentationOfBirdDAO.save(dto);

		bird.fly(dto1);

		bird.eat(null);

		bird.swim(dto);

	}

}
