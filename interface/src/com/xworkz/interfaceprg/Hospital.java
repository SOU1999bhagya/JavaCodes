package com.xworkz.interfaceprg;

public class Hospital {

	private String name;
	private String location;
	private String govt;
	private HospitalAdmitRule admit;
	private HospitalDischargeRule discharge;

	public Hospital() {
		System.out.println("Invoked no-args constructor of Hospital");
	}

	public Hospital(String name, String location, String govt, HospitalAdmitRule admit,
			HospitalDischargeRule discharge) {
		super();
		System.out.println(this.name = name);
		System.out.println(this.location = location);
		System.out.println(this.govt = govt);
        this.admit=admit;
        this.discharge=discharge;
	}

	public void admitPatient() {
		System.out.println("Invoked admit patient");
		if (admit != null) {
			System.out.println("Invoked ref of Hospital Admit rule");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		} else {
			System.err.println("Admit is equal to null");
		}

		String reg = this.admit.register();
		if (reg != null) {
			System.out.println("Registered/Not Registered: ".concat(reg));
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		} else {
			System.err.println("Patient not registered");
		}
		double advance = this.admit.payAdvance();
		if (advance >= 30000) {
			System.out.println("Advance paid = ".concat(String.valueOf(advance)));
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		} else {
			System.err.println("Advance is not paid");
		}
		boolean insurance = this.admit.validInsurance();
		if (insurance) {
			System.out.println("Insurance is valid");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		} else {
			System.err.println("Insurance is not valid");
		}
	}

	public void dischargePatient() {
		System.out.println("Invoked Discharge Patient");
		if (discharge != null) {
			System.out.println("Discharge not equal to null");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		} else {
			System.err.println("Discharge equal to null");
		}
		boolean payBill = this.discharge.payBill();
		if (payBill) {
			System.out.println("Paid by the Bill");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		} else {
			System.err.println("Not paid By the Bill");
		}
		double discount = this.discharge.discount();
		if (discount >= 1000) {
			System.out.println("Discount should be given to th patient");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		} else {
			System.err.println("Discount not given");
		}
	}
}
