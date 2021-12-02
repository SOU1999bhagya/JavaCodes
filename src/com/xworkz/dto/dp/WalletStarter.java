package com.xworkz.dto.dp;

import com.xworkz.dto.dp.dao.WalletDAO;
import com.xworkz.dto.dp.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {
		WalletDAO dao=new WalletDAO();
		WalletDTO dtos1=new WalletDTO("Vega", "Leather", 5, 500f, 2);
		WalletDTO dtos2=new WalletDTO("Nexa", "Nylon", 12, 555.0f, 4);
		WalletDTO dtos3=new WalletDTO("puma", "velvet", 15, 540.0f, 5);
		WalletDTO dtos4=new WalletDTO("vogue", "polyester", 5, 500f, 2);
		WalletDTO dtos5=new WalletDTO("qutra", "silk", 5, 500f, 2);
		
		dao.create(dtos1);
		dao.create(dtos2);
		dao.create(dtos3);
		dao.create(dtos4);
		dao.create(null);
		dao.create(dtos5);
        dao.create(new WalletDTO("puma", "velvet", 15, 540.0f, 5), 4);
        
        int occupy=dao.indexOccupied();
        System.out.println("Index Occupied: ".concat(String.valueOf(occupy)));
        System.out.println();
        
        boolean occupy1=dao.matchCompany("qutra");
        System.out.println("Matching Company: ".concat(String.valueOf(occupy1)));
	}

}
