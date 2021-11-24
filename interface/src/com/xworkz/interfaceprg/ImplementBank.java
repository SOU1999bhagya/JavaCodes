package com.xworkz.interfaceprg;

public class ImplementBank implements BankDAO {

	private BankDTO[] dtos=new BankDTO[5];
	int count=0;
	
	@Override
	public void update(int index, BankDTO dto) {
		if(index>=0 && index<dtos.length && dto!=null) {
			this.dtos[index]=dto;
			System.out.println("The bank dto is updated ".concat(String.valueOf(dto.getName())));
		}else {
			System.err.println("Bank Dto is not updated");
		}
		
	}
	
	@Override
	public boolean searchByIFSC(String ifsc) {
		for (int i = 0; i < dtos.length; i++) {
			BankDTO bankDTO=dtos[i];
			if(bankDTO!=null && ifsc!=null) {
				 String ifo=bankDTO.getIfsc();
				 if(ifo.equals(ifsc)) {
					 System.out.println("Searched by IFSC ".concat(ifo));
					 return true;
				 }
				 else {
					 System.err.println("Not searched by ifsc");
					 
				 }
			}
		}
		return false;
		
	}
	
	
}
