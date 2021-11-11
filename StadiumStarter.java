package com.xworkz.override;

import com.xworkz.override.objectClasses.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
		
		Stadium stadium=new Stadium();
		
		String stadium1=stadium.toString();
		System.out.println(stadium1);
		int stadium2=stadium.hashCode();
		System.out.println(stadium2);
		
		Stadium stadium3=new Stadium();
		
		stadium.setCity("Bangalore");
		stadium3.setCity("Bangalore");
		stadium3.setName("Chinnaswamy");
		stadium.setName("Chinnaswamy");

		System.out.println(stadium.equals(stadium3));
	}

}
