package com.xworkz.exception;

public class StorageFullRunTimeException extends RuntimeException {

	public StorageFullRunTimeException() {
		super();
	}
	
	public StorageFullRunTimeException(String msg) {
		super(msg);
	}
}
