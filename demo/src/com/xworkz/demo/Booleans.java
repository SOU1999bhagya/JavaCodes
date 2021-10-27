package com.xworkz.demo;

public class Booleans {

	public static void main(String[] args) {
		boolean a=true;
		Boolean obj=a;
		
		System.out.println(obj.booleanValue());
        System.out.println(obj.compareTo(true));
        System.out.println(obj.equals(obj));
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        
        //byte
        byte x=0101;
		Byte obj=x;
		
		System.out.println(obj.compareTo(x));
		System.out.println(obj.doubleValue());
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.longValue());
		
		double y=123456789;
		Double obj=y;
		
		System.out.println(obj.doubleValue());
		System.out.println(obj.floatValue());
		System.out.println(obj.getClass());
		System.out.println(obj.BYTES);
		System.out.println(obj.SIZE);
		
		float x=3.142f;
		Float obj=x;
		
		System.out.println(obj.doubleValue());
		System.out.println(obj.BYTES);
		System.out.println(obj.MIN_VALUE);
		System.out.println(obj.MIN_EXPONENT);
		System.out.println(obj.toHexString(x));
		short x=100;
		Short obj=x;
		
		System.out.println(obj.compareTo(x));
		System.out.println(obj.doubleValue());
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		
		ong x=300;
		Long obj=x;
		
		System.out.println(obj.doubleValue());
		System.out.println(obj.MAX_VALUE);
		System.out.println(obj.BYTES);
		System.out.println(obj.SIZE);
		System.out.println(obj.MIN_VALUE);
		
	}

}
