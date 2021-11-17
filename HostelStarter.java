package com.xworkz.interfaceprg.interfacestarter;

import com.xworkz.interfaceprg.HostelRule;
import com.xworkz.interfaceprg.SharavathiHostel;
import com.xworkz.interfaceprg.VisitingRule;

public class HostelStarter {

	public static void main(String[] args) {
		//we cannot instantiate the interface class because the Hostel class is abstract class
		HostelRule hostelRule=new SharavathiHostel();
		//System.out.println(hostelRule.inTime());
		
		//Object object=new SharavathiHostel();
		VisitingRule rule=new SharavathiHostel();
		
		System.out.println(rule.visitingDay());
		System.out.println(rule.inTime());
		
		
	 System.out.println(hostelRule.inTime());
			
			
		
	
	

	}

}
