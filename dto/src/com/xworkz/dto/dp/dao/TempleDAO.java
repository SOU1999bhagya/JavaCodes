package com.xworkz.dto.dp.dao;

import com.xworkz.dto.dp.dto.TempleDTO;

public class TempleDAO {

	TempleDTO[] templeDTOs=new TempleDTO[10];
 private int count=0;
 
 public void save(TempleDTO name) {
	if(name!=null) {
		this.templeDTOs[this.count++]=name;
		System.out.println("The name are saved ".concat(name.getName()));
	}
	else {
		System.err.println("The names are saved");
	}
     
}
 public void delete(int index) {
	if(index>=0 && index<templeDTOs.length) {
		this.templeDTOs[index]=null;
		System.err.println("The index is pointing to null".concat(String.valueOf(index)));
		
	}
	else {
		System.out.println("The index is pointing to null");
	}

}
	public void update(int index,TempleDTO name) {
		if(index>=0 && index<templeDTOs.length && name!=null) {
			this.templeDTOs[index]=name;
			System.out.println("The index is updated".concat(String.valueOf(name)));
		}
		else {
			System.out.println("The index is not pointing to null");
		}

	}
	public TempleDTO[] getTempleDTOs() {
		return templeDTOs;
	}
	
}
