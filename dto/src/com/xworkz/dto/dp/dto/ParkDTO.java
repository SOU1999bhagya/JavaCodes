package com.xworkz.dto.dp.dto;

public class ParkDTO {
private String parkName;
private String location;
private String timings;
private int noofBenches;
private String holiday;

public ParkDTO() {
System.out.println("invoked no argument constructor");
}

public ParkDTO(String parkName, String location, String timings, int noofBenches, String holiday) {
	super();
	this.parkName = parkName;
	this.location = location;
	this.timings = timings;
	this.noofBenches = noofBenches;
	this.holiday = holiday;
}

public String getParkName() {
	return parkName;
}

public String getLocation() {
	return location;
}

public String getTimings() {
	return timings;
}

public int getNoofBenches() {
	return noofBenches;
}

public String getHoliday() {
	return holiday;
}

public void setParkName(String parkName) {
	this.parkName = parkName;
}

public void setLocation(String location) {
	this.location = location;
}

public void setTimings(String timings) {
	this.timings = timings;
}

public void setNoofBenches(int noofBenches) {
	this.noofBenches = noofBenches;
}

public void setHoliday(String holiday) {
	this.holiday = holiday;
}


}
