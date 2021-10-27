package com.xworkz.dto.dp.dao;

import com.xworkz.dto.dp.dto.CameraDTO;

public class CameraDAO {

	private CameraDTO[] cameraDTOs=new CameraDTO[10];
	private int count=0;
	
	public void save(CameraDTO dto) {
       if(this.count<cameraDTOs.length && dto!=null) {
    	   this.cameraDTOs[this.count++]=dto;
		System.out.println("Invoked save method and not pointing to null ".concat(dto.getCompanyName()));
       }
       else {
    	   System.out.println("index is saved ");
       }
	}
	public void delete(int index) {
		if(index>0 && index<cameraDTOs.length) {
			this.cameraDTOs[index]=null;
			System.out.println("Invoked delete and pointing to null ".concat(String.valueOf(index)));
			}
		else {
			System.out.println("Index is not pointing to null");
		}

	}
	public void update(int index,CameraDTO dto) {
		if(index>0 && index<cameraDTOs.length && dto!=null) {
		this.cameraDTOs[index]=dto;
System.out.println("Invoked Update and index is not pointing to null".concat(String.valueOf(index)).concat(" ").concat(String.valueOf(dto.getPixel())));
		}
	else {
		System.out.println("index is updated");
	}
	}
	public CameraDTO[] getCameraDTOs() {
		return cameraDTOs;
	}
	}
