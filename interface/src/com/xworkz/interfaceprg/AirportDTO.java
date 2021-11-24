package com.xworkz.interfaceprg;

public class AirportDTO {

	private int id;
	private String name;
	private String location;
	private String type;
	
	
	public AirportDTO(int id, String name, String location, String type) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}


	public String getType() {
		return type;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
