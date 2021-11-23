package com.xworkz.interfaceprg;

public class HospitalPatient implements HospitalAdmitRule, HospitalDischargeRule {

	@Override
	public String register() {
		System.out.println("Invoked Register method");
		return "Registered";
	}

	@Override
	public double payAdvance() {
		System.out.println("Invoked Pay Advance method");
		return 35000;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Invoked valid Insurance ");
		return true;
	}

	@Override
	public boolean payBill() {
		System.out.println("Invoked ");
		return true;
	}

	@Override
	public double discount() {
		System.out.println("Invoked Discount");
		return 5000;
	}
}
