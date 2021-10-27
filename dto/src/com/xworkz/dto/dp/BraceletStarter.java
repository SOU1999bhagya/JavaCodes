package com.xworkz.dto.dp;

import com.xworkz.dto.BraceletDTO;

public class BraceletStarter {

	public static void main(String[] args) {
		BraceletDTO braceletDto=new BraceletDTO();
		braceletDto.setColour("Silver");
		braceletDto.setGemUsed(false);
		braceletDto.setGifted(true);
		braceletDto.setMaterial("Platinum");
		braceletDto.setPrice(300.0f);
		
		BraceletDTO bracelet1=new BraceletDTO("pink", 250.0f, "iron", true, false);
		BraceletDTO bracelet2=new BraceletDTO("black", 100.0f, "metal", false,true);
		BraceletDTO bracelet3=new BraceletDTO("green", 150.0f, "gold", true, false);
		BraceletDTO bracelet4=new BraceletDTO("pista", 120.0f, "platinum", false, true);
		
		BraceletDTO[] ref=new BraceletDTO[5];
		ref[0]=braceletDto;
		ref[1]=bracelet1;
		ref[2]=bracelet2;
		ref[3]=bracelet3;
		ref[4]=bracelet4;
		for(int lock=0;lock<ref.length;lock++) {
			BraceletDTO army=ref[lock];
			if(army!=null) {
				System.out.println(army.getColour());
				System.out.println(army.getMaterial());
				System.out.println(army.getPrice());
				System.out.println(army.isGemUsed());
				System.out.println(army.isGifted());
			}
			else {
				System.err.println("Index is not pointing to null".concat(String.valueOf(lock)));
			}
		}
	}

}
