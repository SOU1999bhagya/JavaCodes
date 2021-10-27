package com.xworkz.dto.dp.dao;

import com.xworkz.dto.dp.dto.MilkCanDTO;

public class MilkCanDAO {

	private MilkCanDTO[] canDTOs=new  MilkCanDTO[10];
	private int temp=0;
	
	public void create(MilkCanDTO dto) {
		if(temp<canDTOs.length && dto!=null) {
			this.canDTOs[this.temp++]=dto;
			System.out.println("Invoked create method ".concat(dto.getShape()));
		}
		else {
			System.out.println("index is pointing to null");
		}
}
	public void create(MilkCanDTO dto,int index) {
		if(index>0 && index>canDTOs.length && dto!=null) {
			this.canDTOs[index]=dto;
			System.out.println("Invoked Constructor overload ".concat(String .valueOf(dto.getQuantity())));
		}
		else {
			System.out.println("parameterised constructor");
		}

	}
	public int indexOccupied() {
		return this.temp;
	}
	
	public boolean matchShape(String shape) {
		System.out.println("Invoked match the shape");
		for(int match=0;match<canDTOs.length;match++) {
			MilkCanDTO can=canDTOs[match];
			if(can!=null) {
				System.out.println("MilkCan Shape:".concat(String.valueOf(match)));
				String can1=can.getShape();
				if(shape.equals(can1)) {
					System.out.println("Matching Milkcan Shape:".concat(can1));
				}
				return true;
				
			}
		}
		return false;
	}
}
