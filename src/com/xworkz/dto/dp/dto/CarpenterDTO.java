package com.xworkz.dto;

public class CarpenterDTO {
private String carpenterName;
private int experience;
private double salary;
private String work;
private int age;

public CarpenterDTO() {
	System.out.println("invoked no argument constructor");
}

public CarpenterDTO(String carpenterName, int experience, double salary, String work, int age) {
	super();
	this.carpenterName = carpenterName;
	this.experience = experience;
	this.salary = salary;
	this.work = work;
	this.age = age;
}

public String getCarpenterName() {
	return carpenterName;
}

public int getExperience() {
	return experience;
}

public double getSalary() {
	return salary;
}

public String getWork() {
	return work;
}

public int getAge() {
	return age;
}

public void setCarpenterName(String carpenterName) {
	this.carpenterName = carpenterName;
}

public void setExperience(int experience) {
	this.experience = experience;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public void setWork(String work) {
	this.work = work;
}

public void setAge(int age) {
	this.age = age;
}


}
