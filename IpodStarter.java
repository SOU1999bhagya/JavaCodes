package com.xworkz.override;

import com.xworkz.override.objectClasses.Ipod;

public class IpodStarter {

	public static void main(String[] args) {

		Ipod ipod = new Ipod();
		String ipod1 = ipod.toString();
		// The return statement will be in
		// getClass().getName() + "@" + Integer.toHexString(hashCode());

		// Whenever we try to print any Object reference, then internally toString()
		// method is called.
		 System.out.println(ipod1);

		 int ipod2=ipod.hashCode();
		 System.out.println(ipod2);
		 
		 Ipod ipod3=new Ipod();

		 //So here we comparing the values which we setted by the different references
		ipod.setModelNo("HS123");
		ipod3.setModelNo("HS123");
		
		boolean teju=ipod.equals(ipod3);
		System.out.println(teju);
		
	}


}
