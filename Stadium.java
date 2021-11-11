package com.xworkz.override.objectClasses;

public class Stadium {

	private String name;
	private String city;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student";//super.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 89;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj!=null) {
			if(obj instanceof Stadium) {
				Stadium stadium=(Stadium)obj;
				String stadium1=stadium.getCity();
				String stadium2=stadium.getName();
				if(this.city.equals(stadium1) && this.name.equals(stadium2)) {
					System.out.println("City and name is matched");
					return true;
				}
				else {
					System.err.println("Not Matched");
				}
				
			}
			
			
		}
		return super.equals(obj);
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
