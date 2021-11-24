package com.xworkz.interfaceprg;

public class AssociateBusRoute {

	private BusRouteDAO dao;
	
	public AssociateBusRoute(BusRouteDAO dao) {
		this.dao=dao;
	}
	
	public void saveByBusRouteDTO(BusRouteDTO dto) {
		if(dto!=null) {
			boolean saved=this.dao.save(dto);
			System.out.println("Saved and invoked method ".concat(dto.getDestinationName()));
		}else {
			System.err.println("Not saved");
		}
	}
	
	public void findBusRouteDTO(BusRouteDTO dto) {
		
		BusRouteDTO route=dao.findByName("wahab");
		if(dto!=null && route!=null) {
			System.out.println("Invoked by find busroute ");
		}else {
			System.err.println("not finded in associate");
		}
	}
	
	public void displayAllDetails() {
		if(dao!=null) {
		this.dao.displayDetails();
		}
	}
}
