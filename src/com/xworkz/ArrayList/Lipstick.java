package com.xworkz.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Lipstick {

	public static void main(String[] args) {
		String bike1 = "Sheer or satin";
		String bike2 = "Creamy";
		String bike3 = "Matte";
		String bike4 = "Lip stains";
		String bike5 = "glossy";
		String bike6 = "frosted ";
		String bike7 = "tinted lip balm";
		String bike8 = "lip liner";
		String bike9 = "Maybeline";
		String bike10 = "Ymaha";
		String bike11 = "ktm";
		String bike12 = "jawa";
		String bike13 = "revolt";
		String bike14 = "suzuki";
		String bike15 = "CFMoto";
		String bike16 = "Harley";
		String bike17 = "Kawasaki";
		String bike18 = "vespa";
		String bike19 = "ducati";
		String bike20 = "triumph";
		String bike21 = "benelli";
		String bike22 = "Aprilia";
		String bike23 = "Husqvarna";
		String bike24 = "Yobykes";
		String bike25 = "yukie";
		String bike26 = "white carbon ";
		String bike27 = "Tuwal";
		String bike28 = "Toutche";
		String bike29 = "Techo";
		String bike30 = "sym";
		String bike32 = "svitch";
		String bike33 = "stella";
		String bike34 = "super soco";
		String bike35 = "simple energy";
		String bike36 = "raftaaar";
		String bike37 = "pure EV";
		String bike38 = "prevail electric";
		String bike39 = "poise scooters";
		String bike40 = "orxa";
		String bike41 = "ola";
		String bike42 = "okinawa";
		String bike43 = "one";
		String bike44 = "odysse";
		String bike45 = "norton";
		String bike46 = "NDS";
		String bike47 = "MV Agusta";
		String bike48 = "M2GO";
		String bike49 = "lohia";
		String bike50 = "lambretta";
		String bike51 = "Nivea";
		String bike52 = "Maybeline";

		Collection<String> collection = new ArrayList<String>();

		collection.add(bike50);
		collection.add(bike49);
		collection.add(bike48);
		collection.add(bike47);
		collection.add(bike46);
		collection.add(bike45);
		collection.add(bike44);
		collection.add(bike43);
		collection.add(bike42);
		collection.add(bike41);
		collection.add(bike40);
		collection.add(bike39);
		collection.add(bike38);
		collection.add(bike37);
		collection.add(bike36);
		collection.add(bike35);
		collection.add(bike34);
		collection.add(bike33);
		collection.add(bike32);

		collection.add(bike30);
		collection.add(bike29);
		collection.add(bike28);
		collection.add(bike27);
		collection.add(bike26);
		collection.add(bike25);
		collection.add(bike24);
		collection.add(bike23);
		collection.add(bike24);
		collection.add(bike23);
		collection.add(bike22);
		collection.add(bike21);
		collection.add(bike20);
		collection.add(bike19);
		collection.add(bike18);
		collection.add(bike17);
		collection.add(bike16);
		collection.add(bike15);
		collection.add(bike14);
		collection.add(bike13);
		collection.add(bike12);
		collection.add(bike11);
		collection.add(bike10);
		collection.add(bike9);
		collection.add(bike8);
		collection.add(bike7);
		collection.add(bike6);
		collection.add(bike5);
		collection.add(bike4);
		collection.add(bike3);
		collection.add(bike2);
		collection.add(bike1);
		collection.add("Nivea");
		collection.add("Maybeline");
		collection.add("Vasiline");
		collection.add("Lip gloss");
		collection.add("Lakme");
		collection.add("Huda");
		collection.add("Duper");
		collection.add("jjjhjj");
		collection.add("Vaseline");
		collection.add(bike52);
		collection.add(bike51);

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String fun = itr.next();
			System.out.println(fun);
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		boolean del = collection.remove(bike30);

		System.out.println("The 30th value is remooved ".concat(String.valueOf(del)));

		System.out.println(collection.size());

		/*
		 * List<String> list=new ArrayList<String>(); String removedStr=list.remove(30);
		 * System.out.println(list);
		 * System.out.println(">>>>>>>>>>>>>>>>>> ".concat(removedStr));
		 */

		System.out.println();
		System.out.println();
		boolean con = collection.contains("Nivea");
		System.out.println("The Nivea lipstick is found ".concat(String.valueOf(con)));

		System.out.println("Is the list is empty " + collection.isEmpty());

		collection.clear();

		System.out.println("Is the lis is empty " + (collection.isEmpty()));
	}

}
