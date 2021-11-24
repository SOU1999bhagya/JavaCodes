package com.xworkz.interfaceprg;

public interface BankDAO {

	
	
	
	
	void update(int index,BankDTO dto);
	
	boolean searchByIFSC(String ifsc);
}
