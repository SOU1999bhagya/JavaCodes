package com.xworkz.dto.dp.dao;

import com.xworkz.dto.dp.dto.CircusDTO;



public class CircusDAO {

	private CircusDTO[] circusDTOs=new CircusDTO[10];
	private int temp=0;
	
	public void create(CircusDTO dtos) {
		if(temp<circusDTOs.length && dtos!=null) {
			this.circusDTOs[this.temp++]=dtos;
		System.out.println("Invoked create and not pointing to null ".concat(dtos.getOwner()));
		
		}
		else {
			System.err.println("index is not pointing to null");
		}

	}
	public void create(CircusDTO dtos,int index) {
		if(index<circusDTOs.length && dtos!=null) {
				this.circusDTOs[index]=dtos;
				System.out.println("invoked create ".concat(String.valueOf(dtos.getNoofAnimals())));
		}
		else {
			System.err.println("Array is full and pointing to null ");
		}

		}
	public int indexOccupied() {
		return this.temp;
	}
	public boolean matchOwner(String owner) {
		System.out.println("Invoked match owner");
		for(int i=0;i<circusDTOs.length;i++) 
		{
			CircusDTO circus=circusDTOs[i];
			if(circus!=null) {
				System.out.println("Matching owner:".concat(String.valueOf(i)));
				String circus1=circus.getOwner();
				if(owner.equals(circus1)) {
					System.out.println("Comparing owner name".concat(circus1));
					return true;
				}
			}
			
		}
		return false;
		
	}
}
