package com.xworkz.dto.dp.dto;

public class CircusDTO {

	private String owner;
	private float ticketPrice;
	private int noofAnimals;
	private int noofShows;
	private float duration;
	
	public CircusDTO() {
		System.out.println("Invoked no argument constructor");
	}

	public CircusDTO(String owner, float ticketPrice, int noofAnimals, int noofShows, float duration) {
		super();
		this.owner = owner;
		this.ticketPrice = ticketPrice;
		this.noofAnimals = noofAnimals;
		this.noofShows = noofShows;
		this.duration = duration;
	}

	public String getOwner() {
		return owner;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public int getNoofAnimals() {
		return noofAnimals;
	}

	public int getNoofShows() {
		return noofShows;
	}

	public float getDuration() {
		return duration;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setNoofAnimals(int noofAnimals) {
		this.noofAnimals = noofAnimals;
	}

	public void setNoofShows(int noofShows) {
		this.noofShows = noofShows;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
	
}
