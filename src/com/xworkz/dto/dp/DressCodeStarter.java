package com.xworkz.dto.dp.dto.dao;

import com.xworkz.dto.dp.dao.DressCodeDAO;
import com.xworkz.dto.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {
		
		DressCodeDAO dao=new DressCodeDAO();
		
DressCodeDAO dto1=new DressCodeDAO(34.6f, "Nylon", "black", 256.6f, 'f');
DressCodeDTO dto2=new DressCodeDTO(34.6f, "polyester", "blue", 256.6f, 'f');
DressCodeDTO dto3=new DressCodeDTO(34.6f, "Velvet", "violet", 256.6f, 'f');
DressCodeDTO dto4=new DressCodeDTO(34.6f, "Silk", "pink", 256.6f, 'f');
DressCodeDTO dto5=new DressCodeDTO(34.6f, "Nylon", "yellow", 256.6f, 'f');

dao.save(dto5);
dao.delete(15);
dao.update(17, dto3);

 DressCodeDTO[] code = dao.getDtos();
 code[0]=dto1;
 code[1]=dto2;
 code[2]=dto2;
 code[4]=dto4;
 code[5]=dto5;
 for(int i=0;i<code.length;i++) {
	 DressCodeDTO code1=code[i];
	 if(code1!=null) {
		 System.out.println(code1.getColor());
		 System.out.println(code1.getGender());
		 System.out.println(code1.getMaterial());
		 System.out.println(code1.getPrice());
		 System.out.println(code1.getSize());
		 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	 }
	 else {
		 System.err.println("Array is full and updated");
	 }
 }


	}

}
