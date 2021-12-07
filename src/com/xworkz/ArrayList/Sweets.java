package com.xworkz.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Sweets {

	public static void main(String[] args) {
		
		String sweet1="Arisa Pitha";
		String sweet2="Apple halwa";
		String sweet3="Balushahi";
		String sweet4="Boondi";
		String sweet5="Ghevar";
		String sweet6="Gulab Jamun";
		String sweet7="Imarti";
		String sweet8="Jalebi";
		String sweet9="Kaju katli";
		String sweet10="kalakand";
		String sweet11="Kheer";
		String sweet12="Khirmohan";
		String sweet13="Chhena";
		String sweet14="Kulfi";
		String sweet15="Laddu";
		String sweet16="Motichoor";
		String sweet17="Malpua";
		String sweet18="Nankahatai";
		String sweet19="Petha";
		String sweet20="Phirni";
		String sweet21="Singori";
		String sweet22="halwa";
		String sweet23="Sohan Papdi";
		String sweet24="Sheera";
		String sweet25="jalebi";
		String sweet26="Jhili";
		String sweet27="Kheeri";
		String sweet28="poda";
		String sweet29="chuda gasa";
		String sweet30="barfi";
		String sweet31="Ledikeni";
		String sweet32="lyangcha";
		String sweet33="Mihindana";
		String sweet34="Pantua";
		String sweet35="puri khaja";
		String sweet36="Ras malai";
		String sweet37="Rsabalai";
		String sweet38="rasgulla";
		String sweet39="Sirir";
		String sweet40="Adhirasam";
		String sweet41="Chikki";
		String sweet42="Pedha";
		String sweet43="Double ka meetha";
		String sweet44="Gavvalu";
		String sweet45="Kakinada khaja";
		String sweet46="Kuzhi";
		String sweet47="Obbattu";
		String sweet48="Pongal";
		String sweet49="Poothrakelu";
		String sweet50="Holagi";
		String sweet51="Godi huggi";
		String sweet52="Payasa";
		String sweet53="shira";
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(sweet53);
		collection.add(sweet52);
		collection.add(sweet51);
		collection.add(sweet50);
		collection.add(sweet49);
		collection.add(sweet48);
		collection.add(sweet47);
		collection.add(sweet46);
		collection.add(sweet45);
		collection.add(sweet44);
		collection.add(sweet43);
		collection.add(sweet42);
		collection.add(sweet41);
		collection.add(sweet40);
		collection.add(sweet39);
		collection.add(sweet38);
		collection.add(sweet37);
		collection.add(sweet36);
		collection.add(sweet35);
		collection.add(sweet34);
		collection.add(sweet33);
		collection.add(sweet32);
		collection.add(sweet31);
		collection.add(sweet30);
		collection.add(sweet29);
		collection.add(sweet28);
		collection.add(sweet27);
		collection.add(sweet26);
		collection.add(sweet25);
		collection.add(sweet24);
		collection.add(sweet23);
		collection.add(sweet22);
		collection.add(sweet21);
		collection.add(sweet20);
		collection.add(sweet19);
		collection.add(sweet18);
		collection.add(sweet17);
		collection.add(sweet16);
		collection.add(sweet15);
		collection.add(sweet14);
		collection.add(sweet13);
		collection.add(sweet12);
		collection.add(sweet10);
		collection.add(sweet9);
		collection.add(sweet8);
		collection.add(sweet7);
		collection.add(sweet6);
		collection.add(sweet5);
		collection.add(sweet4);
		collection.add(sweet3);
		collection.add(sweet2);
		collection.add(sweet1);
		
		
		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String fun = itr.next();
			System.out.println(fun);
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		boolean del = collection.remove(sweet30);

		System.out.println("The 30th value is remooved ".concat(String.valueOf(del)));
		
		
		System.out.println(collection.size());
		
		boolean con = collection.contains("rasgulla");
		System.out.println("The Nivea lipstick is found ".concat(String.valueOf(con)));

		System.out.println("Is the list is empty " + collection.isEmpty());

		collection.clear();

		System.out.println("Is the lis is empty " + (collection.isEmpty()));
		
		System.out.println(collection.size());
		
	}

}
