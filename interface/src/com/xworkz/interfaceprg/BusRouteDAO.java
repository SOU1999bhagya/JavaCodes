package com.xworkz.interfaceprg;

public interface BusRouteDAO {

	boolean save(BusRouteDTO dto);
	
	BusRouteDTO findByName(String busDriverName);
	
	void displayDetails();
	
	
}
