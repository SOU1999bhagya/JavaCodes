package com.xworkz.interfaceprg;

public class AfricaCitizen implements VotingRule, TrafficRule, MarriageRule {

	private String name;
	private String stateName;

	public AfricaCitizen(String name, String stateName) {
		this.name = name;
		this.stateName = stateName;
	}

	public AfricaCitizen() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int validAge() {
		System.out.println("Invoked valid age of Voting Rule of Africa");
		return 19;
	}

	@Override
	public String validId() {
		System.out.println("Invoked valid Id of Voting rule of Africa");
		return "ASADD989";
	}

	@Override
	public boolean validLicense() {
		System.out.println("Invoked valid License of Traffic rule of Africa");
		return true;
	}

	@Override
	public String licenseNo() {
		System.out.println("Invoked license No of Traffic rule of Africa");
		return "SOU1234";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Invoked valid Insurance of Traffic rule of Africa");
		return true;
	}

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("Invoked valid Age of Marriage rule of Africa");
		if (age > 17) {
			System.out.println(gender);
			System.out.println(age);
		} else {
			System.err.println("Age is not eligible");
		}
		return true;
	}

	public void displayDetails() {
		System.out.println("Invoked display details of Africa...............");
		System.out.println(this.name);
		System.out.println(this.stateName);

	}
}
