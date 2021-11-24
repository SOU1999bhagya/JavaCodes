package com.xworkz.interfaceprg;

public class AssociateBank {

	public BankDAO dao;
	
	public AssociateBank(BankDAO dao) {
		this.dao=dao;
	}
	
	
	public void updated(int index,BankDTO dto) {
		if(dto!=null ) {
		this.dao.update(index, dto);
		System.out.println("Update aga leee ".concat(dto.getBranch()));
	}else {
		System.err.println("Adra yen maduda update agilla");
	}
}
	
	public void ifsc(String ifsc) {
		if(ifsc!=null) {
			boolean searched=this.dao.searchByIFSC(ifsc);
			System.out.println(searched);
				
			}else {
				System.err.println("sikkilla IFSC");
		}
	}
}
