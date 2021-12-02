package com.xworkz.dto.dp.dto;

import com.xworkz.dto.dp.dao.LawyerDAO;

public class LawyerStarter {

	public static void main(String[] args) {
		LawyerDAO dao=new LawyerDAO();
		
		LawyerDTO dtos1 = new LawyerDTO("Akshi", "LLB", 5, 'f', 20, "Red fort", 34,45);
		LawyerDTO dtos2 = new LawyerDTO("Varshi", "LLB", 8, 'f', 30, "Supreme fort", 22,30);
		LawyerDTO dtos3 = new LawyerDTO("Tejii", "B.E", 51, 'f', 45, "Red fort",14,18);
		LawyerDTO dtos4 = new LawyerDTO("AkshiHandi", "MBBS", 56, 'f', 50, "Red fort",7,6);
		LawyerDTO dtos5 = new LawyerDTO("Parshya", "Llb", 59, 'f', 47, " Red fort 223",8,9);

		dao.create(dtos2);
		dao.create(dtos5);
		dao.create(dtos4);
		
		
		
		LawyerDTO[] lawyer1=dao.getLawyerDTOs();
		
		lawyer1[0]=dtos1;
		lawyer1[1]=dtos2;
		lawyer1[2]=dtos3;
		lawyer1[3]=dtos4;
		lawyer1[4]=dtos5;
		
		dao.delete(4);
		dao.delete(3);
		
		
		
		for (int i = 0; i < lawyer1.length; i++)
		{
			LawyerDTO lawyer2=lawyer1[i];
			if(lawyer2!=null) {
				System.out.println(lawyer2.getAge());
				System.out.println(lawyer2.getCourtType());
				System.out.println(lawyer2.getExperience());
				System.out.println(lawyer2.getGender());
				System.out.println(lawyer2.getName());
				System.out.println(lawyer2.getQualification());
				System.out.println(lawyer2.getCasesWon());
				System.out.println(lawyer2.getCasesLoss());
		}
			else 
			{
			System.err.println("The values are not printing");
		}
		
	}
		boolean akshu=dao.searchByName("Tejii");
		System.out.println("Finally matched ".concat(String.valueOf(akshu)));
		System.out.println();
		
		boolean akshu1=dao.searchByCasesWon(34);
		System.out.println("The Total cases won are ".concat(String.valueOf(akshu1)));
		System.out.println();
		
		dao.save(2, dtos3);
		System.out.println();
		String akshu3=dao.getQualificationByName("AkshiHandi");
		System.out.println(akshu3);
		int akshu4=dao.getExpByName("Akshi");
		System.out.println(akshu4);
		
		dao.getLawyerWithMaxExp();
	}
}
