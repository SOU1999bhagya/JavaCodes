package com.xworkz.dto;

public class CraneDTO {
     private String name;
     private String height;
     private float weight;
     private String color;
     private String forest;
     private boolean babies;
     private String type;
     
     public CraneDTO() {
	    System.out.println("No argument constructor is invoked");
	}

public CraneDTO(String name, String height, float weight, String color, String forest, boolean babies,
			String type) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.forest = forest;
		this.babies = babies;
		this.type = type;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getHeight() {
	return height;
}

public void setHeight(String height) {
	this.height = height;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getForest() {
	return forest;
}

public void setForest(String forest) {
	this.forest = forest;
}
public boolean isBabies() {
	return babies;
}
public void setBabies(boolean babies) {
	this.babies = babies;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}     
}
