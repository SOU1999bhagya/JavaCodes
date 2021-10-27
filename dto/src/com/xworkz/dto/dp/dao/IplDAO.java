package com.xworkz.dto.dp.dao;

import com.xworkz.dto.dp.dto.IplDTO;

public class IplDAO {

	private IplDTO[] dtos=new IplDTO[10];
	private int octopus=0;
	
	public void create(IplDTO dto) {
		if(octopus<dtos.length && dto!=null) {
		this.dtos[this.octopus++]=dto;
		System.out.println("Invoked create and not pointing to null ".concat(dto.getOwner()));
		}
		else {
			System.err.println("Invalid name ");
		}
	}
	
	public void create(IplDTO dto,int index) {
		if(index<dtos.length && index>0 && dto!=null) {
			this.dtos[index]=dto;
			System.out.println("Invoked create method ".concat(dto.getSponsor().concat(" ").concat(String.valueOf(dto.getNoofTeams()))));
		}
		else {
			System.out.println("index is pointing to null");
		}
	}
	public int indexOccupied() {
		return this.octopus;
	}
	
	public boolean matchOwner(String owner) {
		System.out.println("Invoked match owner");
		System.out.println("The Owner Name".concat(owner));
		for(int deathNote=0;deathNote<dtos.length; deathNote++) 
		{
			IplDTO owner1=this.dtos[deathNote];
			if(owner1!=null) 
			{
				System.out.println("The owner name is matched ".concat(String.valueOf(deathNote)));
				String owner2=owner1.getOwner();
				System.out.println("Matching:".concat(owner2));
				if(owner.equals(owner2)) {
					System.out.println("Owner name found");
					return true;
				}
			}
		
	}
		return false;
		
	}
}
