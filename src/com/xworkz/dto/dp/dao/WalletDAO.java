package com.xworkz.dto.dp.dao;

import com.xworkz.dto.dp.dto.WalletDTO;

public class WalletDAO {

	private WalletDTO[] walletDTOs=new WalletDTO[10];
	private int count=0;
	
	public void create(WalletDTO dtos) {
		if(count<walletDTOs.length && dtos!=null) {
			this.walletDTOs[this.count++]=dtos;
		System.out.println("Invoked create and not pointing to null ".concat(dtos.getCompanyName()));
		
		}
		else {
			System.err.println("index is not pointing to null");
		}

	}
	public void create(WalletDTO dtos,int index) {
	if(index<walletDTOs.length && dtos!=null) {
			this.walletDTOs[index]=dtos;
			System.out.println("invoked create ".concat(dtos.getCompanyName()));
	}
	else {
		System.err.println("Array is full and pointing to null ");
	}

	}
	public int indexOccupied() 
	{
		return this.count;
		}
	public boolean matchCompany(String companyName) {
		System.out.println("Invoked match company name");
		System.out.println("Company Name: ".concat(companyName));
		for(int i=0;i<walletDTOs.length;i++) 
		{
			WalletDTO wallet=walletDTOs[i];
			if(wallet!=null)
			{
				System.out.println("The Company Name is ".concat(String.valueOf(i)));
				String wallet1=wallet.getCompanyName();
				System.out.println("Matching:".concat(wallet1));
				if(companyName.equals(wallet1)) 
				{
				System.out.println("Company name found");
			return true;	
			}
				
			
		}
		}
		return false;
		
	}
}
