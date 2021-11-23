package com.xworkz.interfaceprg;

public interface VisitingRule extends HostelRule {

	String visitingDay();
	
	//we can extend the interface class by the class Hostel
	@Override
	default int inTime() {
		System.out.println("Invoked intime method by extending Hostel");
		return 10;
	}
}
