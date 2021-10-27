package com.xworkz.dto.dp;

import com.xworkz.dto.dp.dao.CameraDAO;
import com.xworkz.dto.dp.dto.CameraDTO;

public class CameraStarter {
	
	public static void main(String args[]) {
		
		CameraDAO dao=new CameraDAO();

	CameraDTO dtos1=new CameraDTO("Nikon", "type", 16.5f, 200);
	CameraDTO dtos2=new CameraDTO("Canon", "type", 16.5f, 200);
	CameraDTO dtos3=new CameraDTO("dcsd", "type", 16.5f, 200);
	CameraDTO dtos4=new CameraDTO("dcdcdcv", "type", 16.5f, 200);
	CameraDTO dtos5=new CameraDTO("kkkkkhg", "type", 16.5f, 200);
	
	dao.save(dtos1);
	dao.delete(-1);
	dao.update(3, dtos4);
	
	CameraDTO[] camera=dao.getCameraDTOs();
	camera[0]=dtos1;
	camera[1]=dtos2;
	camera[3]=dtos3;
	camera[4]=dtos5;
	
	for(int i=0;i<camera.length;i++) {
		CameraDTO camera1=camera[i];
		if(camera1!=null) {
			System.out.println(camera1.getCompanyName());
			System.out.println(camera1.getPixel());
			System.out.println(camera1.getPrice());
			System.out.println(camera1.getType());
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}
		else {
			System.err.println("Array is full and updated");
		}
	}
}
}
