package com.xworkz.dto;

public class BusDriverDTO {

	private String driverName;
	private int experience;
	private double salary;
	private String busName;
	private String place;
	
	public BusDriverDTO() {
		System.out.println("Invoked no-argument constructor");
	}

	public BusDriverDTO(String driverName, int experience, double salary, String busName, String place) {
		super();
		this.driverName = driverName;
		this.experience = experience;
		this.salary = salary;
		this.busName = busName;
		this.place = place;
	}

	public String getDriverName() {
		return driverName;
	}

	public int getExperience() {
		return experience;
	}

	public double getSalary() {
		return salary;
	}

	public String getBusName() {
		return busName;
	}

	public String getPlace() {
		return place;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
