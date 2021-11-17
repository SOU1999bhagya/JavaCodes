package com.xworkz.interfaceprg;

public class SharavathiHostel implements HostelRule,VisitingRule {

	/*@Override
	public int inTime() {
		System.out.println("Invoked in time method");
		return 7;
	}*/
	
	//through interface we inherit the methods of different parent class also
	//the advantage of interface is multiple parent classes can be inherited by the implementation class
	@Override
	public String visitingDay() {
		System.out.println("Invoked visiting day method");
		return "Sunday";
	}
}
