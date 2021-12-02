package com.xworkz.dto.dp.dto;

public class IplDTO {

	private Integer noofTeams;
	private Integer teamSize;
	private String owner;
	private String sponsor;
	private String teamName;
	
	public IplDTO() {
		System.out.println("Invoked no argument constructor");
	}

	public IplDTO(Integer noofTeams, Integer teamSize, String owner, String sponsor, String teamName) {
		super();
		this.noofTeams = noofTeams;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponsor = sponsor;
		this.teamName = teamName;
	}

	public Integer getNoofTeams() {
		return noofTeams;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public String getOwner() {
		return owner;
	}

	public String getSponsor() {
		return sponsor;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setNoofTeams(Integer noofTeams) {
		this.noofTeams = noofTeams;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}
