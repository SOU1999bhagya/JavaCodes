package com.xworkz.override;

import com.xworkz.override.objectClasses.Sock;
import com.xworkz.override.objectClasses.constants.SockMaterial;
import com.xworkz.override.objectClasses.constants.SockType;

public class SockStarter {

	public static void main(String[] args) {
		
		Sock sock=new Sock();
		
		Sock sock2=new Sock();
		
		sock.setMaterial(SockMaterial.NYLON);
		sock2.setMaterial(SockMaterial.NYLON);
		
		sock2.setType(SockType.FULL);
		sock.setType(SockType.FULL);
		
		System.out.println(sock.equals(sock2));
		

	}

}
