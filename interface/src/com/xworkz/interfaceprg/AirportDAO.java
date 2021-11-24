package com.xworkz.interfaceprg;

public interface AirportDAO {

	boolean searchById(int id);
	
	void create(AirportDTO dto);
	
	void save(int index,AirportDTO airport);
	
	String getLocationByName(String name);
		
	
	
}
