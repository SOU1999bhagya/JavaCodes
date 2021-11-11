package com.xworkz.override;

import com.xworkz.override.objectClasses.HeadSet;
import com.xworkz.override.objectClasses.constants.Type1;

public class HeadSetStarter {

	public static void main(String[] args) {
		
		HeadSet sett=new HeadSet();
		
		String set1=sett.toString();
		System.out.println(set1);
		
		int set2=sett.hashCode();
		System.out.println(set2);
		
		HeadSet set3=new HeadSet();
		
		sett.setBrand("JBL");
		set3.setBrand("JBL");
		
		sett.setType(Type1.BLUETOOTH);
		set3.setType(Type1.BLUETOOTH);
		System.out.println(sett.equals(set3));
		

	}

}
