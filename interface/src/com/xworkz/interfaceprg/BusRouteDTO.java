package com.xworkz.interfaceprg;

public class BusRouteDTO {

	private int busId;
	private String busDriverName;
	private String startPoint;
	private String destinationName;
	
	
	public BusRouteDTO(int busId, String busDriverName, String startPoint, String destinationName) {
		super();
		this.busId = busId;
		this.busDriverName = busDriverName;
		this.startPoint = startPoint;
		this.destinationName = destinationName;
	}


	public int getBusId() {
		return busId;
	}


	public String getBusDriverName() {
		return busDriverName;
	}


	public String getStartPoint() {
		return startPoint;
	}


	public String getDestinationName() {
		return destinationName;
	}


	public void setBusId(int busId) {
		this.busId = busId;
	}


	public void setBusDriverName(String busDriverName) {
		this.busDriverName = busDriverName;
	}


	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}


	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	
	
	
}
