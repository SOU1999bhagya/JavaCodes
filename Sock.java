package com.xworkz.override.objectClasses;

import com.xworkz.override.objectClasses.constants.SockMaterial;
import com.xworkz.override.objectClasses.constants.SockType;

public class Sock {

	private int size;
	private SockMaterial material;
	private int price;
	private SockType type;
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj!=null) {
			if(obj instanceof Sock) {
				Sock sock=(Sock)obj;
				SockMaterial mat=sock.getMaterial();
				SockType type1=sock.getType();
				if(this.material.equals(mat) && this.type.equals(type1)) {
					System.out.println("Material and type is matched");
					return true;
				}
				else {
					System.out.println("Not matched");
				}
				
				
				
			}	
		}
		return false;
	}
	
	public void setMaterial(SockMaterial material) {
		this.material = material;
	}
	
	public SockMaterial getMaterial() {
		return material;
	}
	
	public void setType(SockType type) {
		this.type = type;
	}
	
	public SockType getType() {
		return type;
	}
	
}
