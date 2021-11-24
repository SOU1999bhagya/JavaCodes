package com.xworkz.interfaceprg;

public class ImplementationOfAirport implements AirportDAO {

	private AirportDTO[] dtos = new AirportDTO[5];
	int count = 0;

	@Override
	public void create(AirportDTO dto) {
		if (count < dtos.length && dto != null) {
			this.dtos[this.count++] = dto;
			System.out.println("Creted the method ".concat(dto.getName()));
		} else {
			System.err.println("Not created");
		}

	}

	@Override
	public void save(int index, AirportDTO airport) {
		if (index >= 0 && airport != null && index < dtos.length) {
			this.dtos[index] = airport;
			System.out.println("Saved the airport details ".concat(airport.getLocation()));
		} else {
			System.out.println("Not saved");
		}

	}

	@Override
	public boolean searchById(int id) {
		for (int i = 0; i < dtos.length; i++) {
			AirportDTO airport = dtos[i];
			if (airport != null) {
				int air = airport.getId();
				if (id == air) {
					System.out.println("Searched by the id ".concat(String.valueOf(air)));
				} else {
					System.err.println("Not searched by Id");
				}
			}
		}
		return false;
	}

	@Override
	public String getLocationByName(String name) {
		for (int i = 0; i < dtos.length; i++) {
			AirportDTO dto = dtos[i];
			if (dto != null && name != null) {
				String loc = dto.getLocation();
				if (loc.equals(name)) {
					System.out.println("Got location by name.............");
					String name1 = dto.getName();
					System.out.println("Got location by name ".concat(name1));

					return dto.getName();
				}
			}
		}
		return "";
	}

}
