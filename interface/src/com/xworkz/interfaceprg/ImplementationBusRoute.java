package com.xworkz.interfaceprg;

public class ImplementationBusRoute implements BusRouteDAO {

	private BusRouteDTO[] dtos=new BusRouteDTO[5];
	int count=0;
	
	
	@Override
	public boolean save(BusRouteDTO dto) {
		if(count<dtos.length && dto!=null) {
			this.dtos[this.count++]=dto;
			System.out.println("The bus driver name is saved ".concat(dto.getBusDriverName()));
		}else {
			System.err.println("Bus Driver name saved");
		}
		return true;
	}
	
	@Override
	public BusRouteDTO findByName(String busDriverName) {
		for (int i = 0; i < dtos.length; i++) {
			BusRouteDTO bus=dtos[i];
			if(bus!=null && busDriverName!=null) {
				String name=bus.getBusDriverName();
				if(name!=null) {
					if(name.equals(busDriverName)) {
						System.out.println("Finded the bus driver name ".concat(name));
					}else {
						System.err.println("Not finded bus driver name");
					}
				}
			}
		}
		return null;
	}
	
	@Override
	public void displayDetails() {
		for (int i = 0; i < dtos.length; i++) {
			BusRouteDTO route=dtos[i];
			if(route!=null) {
			System.out.println(route.getBusDriverName());
			System.out.println(route.getBusId());
			System.out.println(route.getStartPoint());
			System.out.println(route.getDestinationName());
			}else {
				System.out.println("Not all details displayed");
			}
		}
		
	}
}
