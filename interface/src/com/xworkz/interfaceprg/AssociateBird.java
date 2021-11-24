package com.xworkz.interfaceprg;

public class AssociateBird {

	private BirdDAO dao;
	
	
	public AssociateBird(BirdDAO bird) {
		this.dao=bird;
	}

	public void fly(BirdDTO dto) {
		if (dto != null) {
			System.out.println("Invoked fly of Associate Bird");
			dao.save(dto);
		} else {
			System.out.println("Not saved in Bird");
		}
	}

	public void eat(BirdDTO bird) {
		if(bird!=null ) {
			
		
		System.out.println("Invoked eat of Associate Bird");
		dao.delete(0);
		}
		else {
			System.err.println("Not deleted");
		}
	}

	public void swim(BirdDTO dtos) {
		if (dtos != null) {
			System.out.println("Invoked swim of Associate Bird");
			dao.update(0, dtos);

		} else {
			System.err.println("equal to null");
		}

	}

}
