package com.xworkz.interfaceprg;

public class IndianCitizen implements VotingRule, TrafficRule, MarriageRule {

	private String name;
	private AddressType address;
	int count = 0;

	public IndianCitizen() {
		// TODO Auto-generated constructor stub
	}

	public IndianCitizen(String name, AddressType address) {
		System.out.println("Invoked Indian Citizen Constructor");
		this.address = address;
		this.name = name;
	}

	@Override
	public int validAge() {
		System.out.println("Invoked valid age of Voting Rule");
		return 18;
	}

	@Override
	public String validId() {
		System.out.println("Invoked valid Id of Voting Rule");
		return "HDSBBJ235";
	}

	@Override
	public boolean validLicense() {
		System.out.println("Invoked valid License of Traffic Rule");
		return true;
	}

	@Override
	public String licenseNo() {
		System.out.println("Invoked License No of Traffic Rule");
		return "2KA17ME042";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Invoked valid Insurance of Traffic Rule");
		return false;
	}

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("Invoked valid Age of Marriage Rule");
		if (age > 18) {
			System.out.println(gender);
			System.out.println(age);
		} else {
			System.err.println("The age is smaller");
		}
		return false;
	}

	public void displayNameAndAddressDetails() {
		System.out.println("Invoked Display Name and Address Details");
		System.out.println(this.name);
		System.out.println(this.address);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(AddressType address) {
		this.address = address;
	}

	public AddressType getAddress() {
		return address;
	}
}
