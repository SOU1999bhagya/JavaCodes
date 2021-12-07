package com.xworkz.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WebSeries {

	public static void main(String[] args) {
		
		String web1="Money Heist";
		String web2="Squid Game";
		String web3="Lost in peace";
		String web4="You";
		String web5="Stranger Things";
		String web6="Locke and Key";
		String web7="Delhi Crime";
		String web8="Narcos";
		String web9="Hellbound";
		String web10="My name";
		String web11="Arcan";
		String web12="The withcher";
		String web13="Elite";
		String web14="Dhamaka";
		String web15="Meenakshi";
		String web16="Haseen Dilruba";
		String web17="Ludo";
		String web18="Gunjan Saxena";
		String web19="Dark Desire";
		String web20="Jagame Thandira";
		String web21="Navarasa";
		String web22="Dynasty";
		String web23="Marvels Daredevil";
		String web24="Maid";
		String web25="Sweet Tooth";
		String web26="13 Reasons";
		String web27="BAKI";
		String web28="Kota Story";
		String web29="Extraction";
		String web30="Cobra kai";
		String web31="Lucifer";
		String web32="The worst watch";
		String web33="Lust Stories";
		String web34="Little Things";
		String web35="Never";
		String web36="Sacred games";
		String web37="Mismatched";
		String web38="Jamtara";
		String web39="Peaky Blinders";
		String web40="The crown";
		String web41="She";
		String web43="The Queen";
		String web44="El Chapo";
		String web45="Dark";
		String web46="TVD";
		String web47="Originals";
		String web48="Legacies";
		String web49="Hpoe";
		String web50="conjuring";
		String web51="paatal lok";
		String web52="Made in heaven";
		String web53="Gossip girl";
		String web54="Fringe";
		String web55="The flash";
		String web56="Bandish bandits";
		String web57="Reign";
		String web58="Modern love";
		String web59="The office";
		String web60="Joey";
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(web60);
		collection.add(web59);
		collection.add(web58);
		collection.add(web57);
		collection.add(web56);
		collection.add(web55);
		collection.add(web54);
		collection.add(web53);
		collection.add(web52);
		collection.add(web51);
		collection.add(web50);
		collection.add(web49);
		collection.add(web48);
		collection.add(web47);
		collection.add(web46);
		collection.add(web45);
		collection.add(web44);
		collection.add(web43);
		collection.add(web40);
		collection.add(web41);
		collection.add(web39);
		collection.add(web38);
		collection.add(web37);
		collection.add(web36);
		collection.add(web35);
		collection.add(web34);
		collection.add(web33);
		collection.add(web32);
		collection.add(web31);
		collection.add(web30);
		collection.add(web29);
		collection.add(web28);
		collection.add(web27);
		collection.add(web26);
		collection.add(web25);
		collection.add(web24);
		collection.add(web23);
		collection.add(web22);
		collection.add(web21);
		collection.add(web20);
		collection.add(web19);
		collection.add(web18);
		collection.add(web17);
		collection.add(web16);
		collection.add(web15);
		collection.add(web14);
		collection.add(web13);
		collection.add(web12);
		collection.add(web11);
		collection.add(web10);
		collection.add(web9);
		collection.add(web8);
		collection.add(web7);
		collection.add(web6);
		collection.add(web5);
		collection.add(web4);
		collection.add(web3);
		collection.add(web2);
		collection.add(web1);
		
		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String fun = itr.next();
			System.out.println(fun);
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		boolean del = collection.remove(web30);

		System.out.println("The 30th value is remooved ".concat(String.valueOf(del)));
		
		
		System.out.println(collection.size());
		
		boolean con = collection.contains("TVD");
		System.out.println("The Nivea lipstick is found ".concat(String.valueOf(con)));

		System.out.println("Is the list is empty " + collection.isEmpty());

		collection.clear();

		System.out.println("Is the lis is empty " + (collection.isEmpty()));
		
		
	}

}
