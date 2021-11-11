package com.xworkz.override;

import com.xworkz.override.objectClasses.Belt;

public class BeltStarter {

	public static void main(String[] args) {
		Belt belt=new Belt();
		String belt1=belt.toString();
		System.out.println(belt1);
         int belt2=belt.hashCode();
         System.out.println(belt2);
         
         Belt belt3=new Belt();
         
         belt.setMaterial("Nylon");
         belt3.setMaterial("Nylon");
         
         System.out.println(belt.equals(belt3));
	}

}
