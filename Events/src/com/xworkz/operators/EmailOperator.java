package com.xworkz.operators;

import com.xworkz.exception.EmailValidationException;
import com.xworkz.exception.StorageFullRunTimeException;
import com.xworkz.exception.StorageFullRunTimeException;

public class EmailOperator {

	private String[] mail = new String[5];
	private int count = 0;

	public void save(String email)throws EmailValidationException {
		System.out.println("Invoked save method of Email Operator");
         if(count<mail.length && email!=null) {
        	this.mail[this.count++]=email;
        	if(email.contains("@") && email.endsWith(".com")) {
        		System.out.println("Email validated ");
        	}else {
        		throw new EmailValidationException("Email valid illa leee");
        		
        	}
         }else {
        	 
        	 throw new StorageFullRunTimeException("Email jasti haki lee");
         }
	}
}
