[=package com.xworkz.dto.dp.dao;

import com.xworkz.dto.dp.dto.LawyerDTO;

public class LawyerDAO {

	private LawyerDTO[] lawyerDTOs = new LawyerDTO[10];
	private int temp = 0;

	public void create(LawyerDTO dto) {
		if (temp < lawyerDTOs.length && dto != null) {
			this.lawyerDTOs[this.temp++] = dto;
			System.out.println("The Lawyer name is created and not pointing to null ".concat(dto.getName()));
			System.out.println();
		} else {
			System.err.println("Lawyer name is pointing to null");
		}

	}

	public void delete(int index) {
		System.out.println("Invoked delete");
		if (index >= 0 && index < lawyerDTOs.length) {
			this.lawyerDTOs[index] = null;
			System.out.println("The Court Type is deleted ".concat(String.valueOf(index)));
		} else {
			System.err.println("The Court Type is not deleted ");
		}
	}

	public LawyerDTO[] getLawyerDTOs() {
		return lawyerDTOs;
	}

	public boolean searchByName(String name) {
		System.out.println("Invoked search by name");
		for (int search = 0; search < lawyerDTOs.length; search++) {
			LawyerDTO search1 = lawyerDTOs[search];
			if (search1 != null && name != null) {
				String search2 = search1.getName();
				if (name.equals(search2)) {
					System.out.println("Matched ".concat(search2));
					return true;
				}
			} else {
				System.out.println("The name is not matched ");
			}

		}
		return false;
	}

	public boolean searchByCasesWon(int casesWon) {
		System.out.println("Invoked search by cases won");
		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO vada1 = lawyerDTOs[i];
			if (vada1 != null) {
				int vada2 = vada1.getCasesWon();
				if (vada2 == casesWon) {
					System.out.println("The cases won by the lawyer is ".concat(String.valueOf(vada2)));
					return true;
				} else {
					System.out.println("Invalid cases won");
				}

			}

		}
		return false;
	}

	public void save(int index, LawyerDTO name1) {
		if (index >= 0 && index < lawyerDTOs.length && name1 != null) {
			this.lawyerDTOs[index] = name1;
			System.out.println("The saved names are ".concat(String.valueOf(name1.getCourtType())));
			System.out.println(">................................................");
		} else {
			System.out.println("The name is not saved");
		}
	}

	public String getQualificationByName(String name) {
		System.out.println("Invoked String method of get the qualification");

		for (int qualify = 0; qualify < lawyerDTOs.length; qualify++) {
			LawyerDTO qualify1 = lawyerDTOs[qualify];

			if (qualify1 != null) {
				String tempName = qualify1.getName();

				if (tempName.equals(name)) {
					System.out.println("Name matched ");
					String tempQualification = qualify1.getQualification();
					System.out.println("The temp name is matched".concat(tempQualification));
					return qualify1.getQualification();
				} else {
					System.out.println("Qualification not found");
				}
			}

		}
		return null;
	}
		
		public int getExpByName(String name) {
			System.out.println("Invoked get Experience By Name");
			for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO lawyer=lawyerDTOs[i];
			if(lawyer!=null) {
				System.out.println("Name matched ");
				
				String temp2=lawyer.getName();
				
				if(name.equals(temp2)) {
					System.out.println("Experience matched ".concat(String.valueOf(temp2)));					
					System.out.println("Experience matched");
					return lawyer.getExperience();
				}
				else {
					System.out.println("Experience not found");
				}
			}
		}
			return 0;
	}
		public LawyerDTO getLawyerWithMaxExp() {
			int temp=0;
			System.out.println("Invoked get Lawyer with Max Experience ");
			for (int i = 0; i < lawyerDTOs.length; i++) {
				LawyerDTO lawyer1=lawyerDTOs[i];
				if(lawyer1!=null) {
				if(lawyer1.getExperience()>temp ) {
					temp=lawyer1.getExperience();
				}
				}
			}
			System.out.println(temp);
			return null;
		}
		
		
		
				
	
	
}
