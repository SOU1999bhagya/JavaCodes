package com.xworkz.interfaceprg.interfacestarter;

import com.xworkz.interfaceprg.AssociateBusRoute;
import com.xworkz.interfaceprg.BusRouteDTO;
import com.xworkz.interfaceprg.ImplementationBusRoute;

public class BusRouteScammer {

	public static void main(String[] args) {
		
		BusRouteDTO dto=new BusRouteDTO(43435, "Ankita", "BTM", "Vijayanagar");
		BusRouteDTO dto1=new BusRouteDTO(3232, "wahab", "Banashankari", "Chandapura");
		
		ImplementationBusRoute busRoute=new ImplementationBusRoute();
		AssociateBusRoute route=new AssociateBusRoute(busRoute);
		
		route.saveByBusRouteDTO(dto);
		
		route.findBusRouteDTO(dto1);

		route.displayAllDetails();
	}

}
