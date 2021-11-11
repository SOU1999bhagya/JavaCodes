package com.xworkz.override;

import com.xworkz.override.objectClasses.Tyre;
import com.xworkz.override.objectClasses.constants.TyreType;

public class TyreStarter {

	public static void main(String[] args) {
		
		Tyre tyr=new Tyre();
		
		String tyr1=tyr.toString();
		System.out.println(tyr1);
		int tyr2=tyr.hashCode();
		System.out.println(tyr2);
		
		Tyre try3=new Tyre();
		
		tyr.setBrand("CEAT");
		try3.setTyre(TyreType.BIKETYRE);
		
		tyr.setTyre(TyreType.BIKETYRE);
       try3.setBrand("CEAT");
       
       System.out.println(tyr.equals(try3));
	}

}
