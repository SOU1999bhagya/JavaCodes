package com.xworkz.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Movies {

	public static void main(String[] args) {
		
		
		String movie1="Addhuri";
		String movie2="A";
		String movie3="A.K.47";
		String movie4="Aaru Mooru Ombhatthu";
		String movie5="Aacya";
		String movie6="Aadarshasathi";
		String movie7="Aadithya";
		String movie8="Aaganthyka";
		String movie9="Aaghatha";
		String movie10="Aaha";
		String movie11="Aaha Brahmacahari";
		String movie12="Aaha Nanna Maduvante";
		String movie13="Aakasmika";
		String movie14="Aakramana";
		String movie15="Aakrosha";
		String movie16="Aalemane";
		String movie17="Aanand";
		String movie18="Bhairavi";
		String movie19="Bhashpa";
		String movie20="Jyoti";
		String movie21="Aananda Knada";
		String movie22="Aananda Sagara";
		String movie23="Aapathbandava";
		String movie24="Apthamitra";
		String movie25="Aptharakshaka";
		String movie26="Aarada Gaaya";
		String movie27="Aaradhane";
		String movie28="Aaramba";
		String movie29="Aase";
		String movie30="Aase Abhilashe";
		String movie31="Ase Pooraisu";
		String movie32="Asha";
		String movie33="Aasha Kirana";
		String movie34="Aasha Sundari";
		String movie35="Aashadaboothi";
		String movie36="Aasheervada";
	    
		String movie37="Aasphota (1988)";
		String movie38="		Aata Bombata (1990)";
		String movie39="	Aata Hudugaata (1995)";
		String movie40="Aathanka";
		String movie41="Aathma Bandhana";
		String movie42="Aathma Shakti";
		String movie43="Aavesha";
		String movie44="Abachurina";
		String movie45="Abale";
		String movie46="Abba aa Hudagi";
		String movie47="Abhijith";
		String movie48="Abhimanyu";
		String movie49="Abhinetri";
		String movie50="Accident";
		String movie51="Adalu Badalu";
		String movie52="Adda dari";
		String movie53="Ade Kannu";
		String movie54="Ade raaga ade haadu";
		String movie55="Adhipati";
		String movie56="Adu";
		String movie57="Adrushta";
		String movie58="Adrushtavanta";
		String movie59="Aghora";
		String movie60="Aramane";
		
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add(movie60);
		collection.add(movie59);
		collection.add(movie58);
		collection.add(movie57);
		collection.add(movie56);
		collection.add(movie55);
		collection.add(movie54);
		collection.add(movie53);
		collection.add(movie52);
		collection.add(movie51);
		collection.add(movie50);
		collection.add(movie49);
		collection.add(movie48);
		collection.add(movie47);
		collection.add(movie46);
		collection.add(movie45);
		collection.add(movie44);
		collection.add(movie43);
		collection.add(movie42);
		collection.add(movie41);
		collection.add(movie40);
		collection.add(movie39);
		collection.add(movie38);
		collection.add(movie37);
		collection.add(movie36);
		collection.add(movie35);
		collection.add(movie34);
		collection.add(movie33);
		collection.add(movie32);
		collection.add(movie31);
		collection.add(movie30);
		collection.add(movie29);
		collection.add(movie28);
		collection.add(movie27);
		collection.add(movie26);
		collection.add(movie25);
		collection.add(movie24);
		collection.add(movie23);
		collection.add(movie22);
		collection.add(movie21);
		collection.add(movie20);
		collection.add(movie19);
		collection.add(movie18);
		collection.add(movie17);
		collection.add(movie16);
		collection.add(movie15);
		collection.add(movie14);
		collection.add(movie13);
		collection.add(movie12);
		collection.add(movie11);
		collection.add(movie10);
		collection.add(movie9);
		collection.add(movie8);
		collection.add(movie7);
		collection.add(movie6);
		collection.add(movie5);
		collection.add(movie4);
		collection.add(movie3);
		collection.add(movie2);
		collection.add(movie1);
		
		
		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String fun = itr.next();
			System.out.println(fun);
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		boolean del = collection.remove(movie30);

		System.out.println("The 30th value is remooved ".concat(String.valueOf(del)));
		
		
		System.out.println(collection.size());
		
		boolean con = collection.contains("Aramane");
		System.out.println("The Nivea lipstick is found ".concat(String.valueOf(con)));

		System.out.println("Is the list is empty " + collection.isEmpty());

		collection.clear();

		System.out.println("Is the lis is empty " + (collection.isEmpty()));
		
		System.out.println(collection.size());
		
		
				
				
				

	}

}
