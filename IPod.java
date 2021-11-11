package com.xworkz.override.objectClasses;

public class Ipod {

	private String modelNo;
	
//By using toString(); we get the FQN(Fully qualified name) means we will get as the whole package
	//name with class name in(reverse domain with application name) then we will get a FQN.

	@Override
	//here we over-riding the object class
	public String toString() {
		System.out.println("Invoked toString() method of Object ");
		return "Sony";//super.toString();
	}
	
	//hashCode(); is used to write a hashing algorithm 
	//Returns a hash value that is used to search object in a collection.
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() of Object....");
		return 100;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of object");
		if(obj==null) 
		{
			System.out.println("The Object is equals to null");
			return true;
		}
			if(obj instanceof Ipod) {
				Ipod casted=(Ipod)obj;
				String ipod=casted.getModelNo();
				System.out.println(ipod);
			
			
				if(this.modelNo.equals(ipod)) {
					System.out.println("The model no is matched ");
					return true;
				}
				else {
					System.err.println("Not found");
				}
		
			}
			return false;
	}
	
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
	public String getModelNo() {
		return modelNo;
	}
	
	
}
