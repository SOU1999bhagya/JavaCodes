package com.xworkz.interfaceprg;

public class BirdDTO {

	private String id;
	private String breed;
	private int age;
	private String origin;
	
	
	public BirdDTO(String id, String breed, int age, String origin) {
		super();
		this.id = id;
		this.breed = breed;
		this.age = age;
		this.origin = origin;
	}


	public String getId() {
		return id;
	}


	public String getBreed() {
		return breed;
	}


	public int getAge() {
		return age;
	}


	public String getOrigin() {
		return origin;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	
}
