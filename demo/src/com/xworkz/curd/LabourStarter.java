package com.xworkz.curd;

public class LabourStarter {

	public static void main(String[] args) {
		LabourOperator drink=new LabourOperator();
		drink.addWork("Accountant");
		drink.addWork("Teacher");
		drink.addWork("Driver");
		drink.addWork("Associate Engineer");
		drink.addWork("Coolie");
		drink.addWork("Tailor");
		drink.addWork("Business Man");	
		drink.deleteReference(8);
		drink.UpdateWork(3,null);
		drink.displayWork();

	}

}
