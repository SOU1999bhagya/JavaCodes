package com.xworkz.dto.dp.dto;

public class TempleDTO {

	private String name;
	private String location;
	private String mainGod;
	private boolean prasada;
	private float yestgante;
	
	public TempleDTO() {
		System.out.println("invoked no argument constructor");
	}

	public TempleDTO(String name, String location, String mainGod, boolean prasada, float yestgante) {
		super();
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.prasada = prasada;
		this.yestgante = yestgante;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getMainGod() {
		return mainGod;
	}

	public boolean isPrasada() {
		return prasada;
	}

	public float getYestgante() {
		return yestgante;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public void setPrasada(boolean prasada) {
		this.prasada = prasada;
	}

	public void setYestgante(float yestgante) {
		this.yestgante = yestgante;
	}
	
}
