package com.xworkz.interfaceprg;

public class AssociateAirport {

	private AirportDAO dao;
	
	public AssociateAirport(AirportDAO dao) {
		this.dao=dao;
	}
	
	public void create(AirportDTO dto) {
		if(dto!=null) {
			this.dao.create(dto);
			System.out.println("Created by Associate Airport");
		}else {
			System.err.println("Not created");
		}
	}
	
	public void Id(int id) {
	     
		boolean search=this.dao.searchById(id);
		System.out.println(search);
		
	}
	
	public void location(String name) {
		if(name!=null) {
		String loc=this.dao.getLocationByName(name);
		if(loc!=null) {
			System.out.println("We have got location ".concat(name));
		}else {
			System.err.println("Not got location");
		}
		
	}
	}
	
	public void updated(int index,AirportDTO airport) {
		if(airport!=null && index!=0) {
			dao.save(index, airport);
			System.out.println("The airport details updated ".concat(String.valueOf(airport.getName())));
		}else {
			System.err.println("Not updated");
		}
	}
	
}
