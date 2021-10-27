package com.xworkz.demo;

public class WrapperClass {

	public static void main(String[] args) {
		
		//Integer
		
		//compare
		int no1=10;
		int no2=20;
		int no3=30;
		System.out.println(Integer.compare(no3,no1));
		
		//decode
		System.out.println(Integer.decode("0121"));
        System.out.println(Integer.decode("0x114"));
        
        //doublevalue
        Double dobj=new Double("45");
        double d=dobj.doubleValue();
        System.out.println("Double the value of the object =" +d);
        
        //getInteger
        String str="sou.bhagya.vc";
         System.out.println("Value = "+Integer.getInteger(str));
        
         //reverse
         int a = 102;  
         System.out.println("Number = " + a);  
         System.out.println("After reversing = " + Integer.reverse(a));  
         
         
         
         
         
         
         
    
         
        
	}

}
