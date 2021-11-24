package com.xworkz.interfaceprg;

public class BankDTO {

	private int id;
	private String ifsc;
	private String branch;
	private String name;
	
	
	public BankDTO(int id, String ifsc, String branch, String name) {
		super();
		this.id = id;
		this.ifsc = ifsc;
		this.branch = branch;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public String getIfsc() {
		return ifsc;
	}


	public String getBranch() {
		return branch;
	}


	public String getName() {
		return name;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
