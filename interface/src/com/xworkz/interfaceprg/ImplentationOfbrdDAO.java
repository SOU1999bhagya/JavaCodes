package com.xworkz.interfaceprg;

public class ImplentationOfbrdDAO implements BirdDAO{
	
	
	private BirdDTO[] dtos=new BirdDTO[5];
	
	int count=0;
  
	@Override
	public void save(BirdDTO breed) {
		System.out.println("Invoked save method");
		if(this.count<0 && breed!=null) {
			this.dtos[this.count++]=breed;
			System.out.println("The breed of bird is ".concat(String.valueOf(breed)));
		}else {
			System.err.println("Breed not found");
		}
		
	}
	
	
	@Override
	public void delete(int index) {
		if(index>=0 && index<dtos.length) {
			this.dtos[index]=null;
			System.out.println("Index deleted".concat(String.valueOf(index)));
		}else {
			System.err.println("Index not deleted");
		}
	}		
	
	
	

	@Override
	public void update(int index,BirdDTO breed) {
		System.out.println("Invoked update method");
		if(index>=0 && index<dtos.length && breed!=null) {
			this.dtos[index]=breed;
			System.out.println("The breed updated");
		}else {
			System.err.println("Breed not updated");
		}
		
		
	}
	 
	public BirdDTO[] getDtos() {
		return dtos;
	}
	
	
}
