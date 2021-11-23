package com.xworkz.interfaceprg.interfacestarter;

import com.xworkz.interfaceprg.DevoteeRule;
import com.xworkz.interfaceprg.PublicTempleAssociation;
import com.xworkz.interfaceprg.TempleAssociation;

public class TempleStarter {

	public static void main(String[] args) {
		DevoteeRule rule = new PublicTempleAssociation();

		TempleAssociation temple = new TempleAssociation("Isckon", rule);

		temple.allowDevotees();

		rule.dontTakePhoto();
		rule.slipperOff();
		rule.dontTakePhoto();

	}

}
