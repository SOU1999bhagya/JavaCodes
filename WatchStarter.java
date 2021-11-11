package com.xworkz.override;

import com.xworkz.override.objectClasses.Watch;
import com.xworkz.override.objectClasses.constants.Type;

public class WatchStarter {

	public static void main(String[] args) {
		
		Watch watch=new Watch();
		String ref=watch.toString();
         System.out.println(ref);
		
         int ref1=watch.hashCode();
         System.out.println(ref1);
         
         Watch watch1=new Watch();
         
         watch.setBrand("noise");
         watch1.setBrand("noise");
         
         watch.setType(Type.ANALOG);
         watch1.setType(Type.ANALOG);
         
        boolean noise=watch.equals(watch1);
         System.out.println(noise);
       
         
        
         
         System.out.println(watch.equals(watch1));
         
         
	}

}
