package com.xworkz.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Festival {

	public static void main(String[] args) {

		String festive1 = "Deepavali";
		String festive2 = "Dasara";
		String festive3 = "Onam";
		String festive4 = "Sankranthi";
		String festive5 = "Christmas";
		String festive6 = "Nagarapanchami";
		String festive7 = "Vaikunta Ekadashi";
		String festive8 = "Ramzan";
		String festive9 = "Gudapanchami";
		String festive10 = "Good Friday";
		String festive11 = "Onam";
		String festive12 = "Roja";
		String festive13 = "Gouri Hunnime";
		String festive14 = "Makar Sakranti";
		String festive15 = "Pongal";
		String festive16 = "Basant Panchami";
		String festive17 = "Holi";
		String festive18 = "Durga Puja";
		String festive19 = "Krishna Janmashtami";
		String festive20 = "Ganesh Chaturthi";
		String festive21 = "Gurupurab";
		String festive22 = "Raksha Bandhan";
		String festive23 = "Eid-Ul-Fitr";
		String festive24 = "Bihu Hemi";
		String festive25 = "Easter";
		String festive26 = "Baisakhi";
		String festive27 = "Basant Panchami";
		String festive28 = "Mahavir Jayanti";
		String festive29 = "Ugadi";
		String festive30 = "Chhath";
		String festive31 = "Puja Govardhan";
		String festive32 = "Puja Gudi";
		String festive33 = "Padwa";
		String festive34 = "Republic Day";
		String festive35 = "Camel Festive";
		String festive36 = "Kumbh Mela";
		String festive37 = "Mela Losar";
		String festive38 = "Mewar";
		String festive39 = "Buddha Jayanthi";
		String festive40 = "Thrissur Pooram";
		String festive41 = "Akshya Trithiya";
		String festive42 = "Anant Chaturdashi";
		String festive43 = "Ayuda Pooja";
		String festive44 = "Gandhi Jayanthi";
		String festive45 = "Karwa Chauth";
		String festive46 = "Childrens Day";
		String festive47 = "Teachers Day";
		String festive48 = "Vasant Panchami";
		String festive49 = "Kartik Purnima";
		String festive50 = "Haldi Kumkum";
		String festive51 = "Muhurram";
		String festive52 = "Tulsi Vivah";
		String festive53 = "Ratha-Yathra";
		String festive54 = "Tulsi Pujan Diwas";
		String festive55 = "Paryushan";
		String festive56 = "Pitru Raksha";
		String festive57 = "Sharad Purnima";
		String festive58 = "Pola";
		String festive59 = "Vivaha Panchami";
		String festive60 = "Padwa";

		Collection<String> collection = new ArrayList<String>();
		collection.add(festive60);
		collection.add(festive59);
		collection.add(festive58);
		collection.add(festive57);
		collection.add(festive56);
		collection.add(festive57);
		collection.add(festive56);
		collection.add(festive55);
		collection.add(festive54);
		collection.add(festive53);
		collection.add(festive52);
		collection.add(festive51);
		collection.add(festive50);
		collection.add(festive49);
		collection.add(festive48);
		collection.add(festive47);
		collection.add(festive46);
		collection.add(festive45);
		collection.add(festive44);
		collection.add(festive43);
		collection.add(festive42);
		collection.add(festive41);
		collection.add(festive40);
		collection.add(festive39);
		collection.add(festive38);
		collection.add(festive37);
		collection.add(festive36);
		collection.add(festive35);
		collection.add(festive34);
		collection.add(festive33);
		collection.add(festive32);
		collection.add(festive31);
		collection.add(festive30);
		collection.add(festive29);
		collection.add(festive28);
		collection.add(festive27);
		collection.add(festive26);
		collection.add(festive25);
		collection.add(festive24);
		collection.add(festive23);
		collection.add(festive22);
		collection.add(festive21);
		collection.add(festive20);
		collection.add(festive19);
		collection.add(festive18);
		collection.add(festive17);
		collection.add(festive16);
		collection.add(festive15);
		collection.add(festive14);
		collection.add(festive13);
		collection.add(festive12);
		collection.add(festive11);
		collection.add(festive10);
		collection.add(festive9);
		collection.add(festive8);
		collection.add(festive7);
		collection.add(festive6);
		collection.add(festive5);
		collection.add(festive4);
		collection.add(festive3);
		collection.add(festive2);
		collection.add(festive1);

		
		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String fun = itr.next();
			System.out.println(fun);
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		boolean del = collection.remove(festive30);

		System.out.println("The 30th value is remooved ".concat(String.valueOf(del)));
		
		
		System.out.println(collection.size());
		
		boolean con = collection.contains("Onam");
		System.out.println("The Nivea lipstick is found ".concat(String.valueOf(con)));

		System.out.println("Is the list is empty " + collection.isEmpty());

		collection.clear();

		System.out.println("Is the lis is empty " + (collection.isEmpty()));
		
		System.out.println(collection.size());

	}

}
