package com.xworkz.dto.dp.dao;


import com.xworkz.dto.dp.dto.DressCodeDTO;

public class DressCodeDAO {

	DressCodeDTO[] dtos = new DressCodeDTO[10];
	private int temp = 0;

	public void save(DressCodeDTO name) {
		if (name != null && temp<dtos.length){
			this.dtos[this.temp++] = name;
			System.out.println("invoked save and added the name ".concat(name.getColor()));
		}
		else {
			System.err.println("Array is full######".concat(String.valueOf(temp)));
		}
	}
	public void delete(int index) {
		if(index>0 && index<dtos.length) {
			this.dtos[index]=null;
					System.out.println("index is pointing to null@@@@@@@@ ".concat(String.valueOf(index)));
		}
		else {
			System.err.println("index is not pointing to null>>>>>>>>");
		}

	}
	public void update(int index,DressCodeDTO name) {
		if(index>=0 && index<dtos.length && name!=null) {
     this.dtos[index]=name;
     System.out.println("The index is updated+++++++ ".concat(name.getMaterial()));
     
	}
		else {
			System.out.println("The index is not pointing to null ");
		}
}
	public DressCodeDTO[] getDtos() {
		return dtos;
	}
}
