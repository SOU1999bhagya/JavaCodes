package com.xworkz.interfaceprg.interfacestarter;

import com.xworkz.interfaceprg.AirportDTO;
import com.xworkz.interfaceprg.AssociateAirport;
import com.xworkz.interfaceprg.ImplementationOfAirport;

public class AirportScammer {

	public static void main(String[] args) {
		
		AirportDTO dto=new AirportDTO(3335, "Emirates", "Dubai", "rfdrgd00");
		AirportDTO dto1=new AirportDTO(2324, "Kingfisher", "USA", "bvbggn");
		
		ImplementationOfAirport airport=new ImplementationOfAirport();
		
		AssociateAirport associate=new AssociateAirport(airport);
		
		associate.Id(3335);
		
		associate.create(dto);
		
		associate.location("Kingfisher");
		
		associate.updated(3, dto);
		

	}

}
