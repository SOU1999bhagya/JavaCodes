package com.xworkz.interfaceprg.interfacestarter;

import com.xworkz.interfaceprg.Hospital;
import com.xworkz.interfaceprg.HospitalAdmitRule;
import com.xworkz.interfaceprg.HospitalDischargeRule;
import com.xworkz.interfaceprg.HospitalPatient;

public class HospitalPatientScanner {

	public static void main(String[] args) {
		
		HospitalDischargeRule discharge=new HospitalPatient();
		
		HospitalAdmitRule admit=new HospitalPatient();
		
		Hospital hospital=new Hospital("Suhas", "Vijayanagar", "Central Govt", admit, discharge);
		System.out.println("...........................................................");
		
		hospital.admitPatient();
		hospital.dischargePatient();
	

	}

}
