package com.xworkz.interfaceprg.interfacestarter;

import com.xworkz.interfaceprg.AddressType;
import com.xworkz.interfaceprg.AfricaCitizen;
import com.xworkz.interfaceprg.IndianCitizen;
import com.xworkz.interfaceprg.MarriageRule;
import com.xworkz.interfaceprg.TrafficRule;
import com.xworkz.interfaceprg.VotingRule;

public class CitizenScanner {

	public static void main(String[] args) {

		// Now we are calling all the methods by Indian Citizen which is implemented by
		// the interfaces of
		// voting,traffic and Marriage
		VotingRule voting = new IndianCitizen();
		System.out.println(voting.validAge());
		System.out.println(voting.validId());
		System.out.println("_______________________________________________________");

		TrafficRule traffic = new IndianCitizen();

		System.out.println(traffic.validLicense());
		System.out.println(traffic.validInsurance());
		System.out.println(traffic.validLicense());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		MarriageRule marriage = new IndianCitizen();

		System.out.println(marriage.validAge('f', 22));

		IndianCitizen indian = new IndianCitizen("Tejaswini", AddressType.JAYANAGAR);

		System.out.println();
		System.out.println();
		indian.displayNameAndAddressDetails();

		System.out.println("Calling Indian Citizen methods over.............................................");

		VotingRule voting1 = new AfricaCitizen();

		System.out.println(voting1.validAge());
		System.out.println(voting1.validId());
		System.out.println("*******************************************************");

		TrafficRule traffic1 = new AfricaCitizen();

		System.out.println(traffic1.licenseNo());
		System.out.println(traffic1.validInsurance());
		System.out.println(traffic1.validLicense());
		System.out.println("))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");

		MarriageRule marriage1 = new AfricaCitizen();

		System.out.println(marriage1.validAge('M', 18));

		System.out.println("----------------------------------------------------");

		AfricaCitizen africa = new AfricaCitizen("Varsha", "Keenya");
		africa.displayDetails();

	}

}
