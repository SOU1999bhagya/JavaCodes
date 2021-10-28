package com.xworkz.dto.dp.dto;

public class LawyerDTO {
	private String name;
	private String qualification;
	private int experience;
	private char gender;
	private int age;
	private String courtType;
	private int casesWon;
	private int casesLoss;
	
	public LawyerDTO() {
		System.out.println("Yeddela le LawyerDTO ida no-args constructor");
	}

	public LawyerDTO(String name, String qualification, int experience, char gender, int age, String courtType,
			int casesWon, int casesLoss) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.courtType = courtType;
		this.casesWon = casesWon;
		this.casesLoss = casesLoss;
	}

	public String getName() {
		return name;
	}

	public String getQualification() {
		return qualification;
	}

	public int getExperience() {
		return experience;
	}

	public char getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getCourtType() {
		return courtType;
	}

	public int getCasesWon() {
		return casesWon;
	}

	public int getCasesLoss() {
		return casesLoss;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}

	public void setCasesWon(int casesWon) {
		this.casesWon = casesWon;
	}

	public void setCasesLoss(int casesLoss) {
		this.casesLoss = casesLoss;
	}
	
	

}
