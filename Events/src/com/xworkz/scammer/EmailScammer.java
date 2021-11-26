package com.xworkz.scammer;

import com.xworkz.exception.EmailValidationException;
import com.xworkz.exception.StorageFullRunTimeException;
import com.xworkz.operators.EmailOperator;

public class EmailScammer {

	public static void main(String[] args) throws EmailValidationException{
		
		EmailOperator emailOperator=new EmailOperator();
		
		emailOperator.save("sou@gmail.com");
		emailOperator.save("sangee@gmail.com");
		emailOperator.save("varu@gmail.com");
		emailOperator.save("guggu@gmail.com");
		emailOperator.save("@gmail.com");
		//emailOperator.save("sagar@gmail.com");
		//emailOperator.save("soju@gmail.com");
		

	}

}
