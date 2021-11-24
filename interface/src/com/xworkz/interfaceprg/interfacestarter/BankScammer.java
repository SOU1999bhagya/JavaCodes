package com.xworkz.interfaceprg.interfacestarter;

import com.xworkz.interfaceprg.AssociateBank;
import com.xworkz.interfaceprg.BankDTO;
import com.xworkz.interfaceprg.ImplementBank;

public class BankScammer {

	public static void main(String args[]) {
		
		BankDTO dto=new BankDTO(67676, "NNB77878", "Gadag", "SBI");
		
		BankDTO dto1=new BankDTO(7655, "FGFGGF232", "Dharwad", "HDFC");
		
		ImplementBank bank=new ImplementBank();
		
		AssociateBank associateBank=new AssociateBank(bank);
		
		associateBank.updated(1, dto1);
		
		associateBank.updated(0, dto);
		
		associateBank.ifsc("FGFGGF232");
		
		
	}
}
