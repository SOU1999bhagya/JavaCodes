package com.xworkz.demo;

public class StringsStarter {

	public static void main(String[] args) {
		// pan card

		String varsha = "BSHPS456N";
		String akshu = "AKSH1234U";
		String teju = "TEJU5678AK";
		String chandu = "CHAN1112DU";
		String sammi = "SAMM1314RIN";
		String sara = "SARA1516NA";
		String archi = "ARCH1718NA";
		String laxmi = "LAX1920MI";
		String pooja = "POO2122JA";
		String parshya = "PAR2324SHYA";

		String PAN[] = { varsha, akshu, teju, chandu, sammi, sara, archi, laxmi, pooja, parshya };

		System.out.println("PAN CARD NO:" + PAN[0]);
		System.out.println("PAN CARD NO:" + PAN[1]);
		System.out.println("PAN CARD NO:" + PAN[2]);
		System.out.println("PAN CARD NO:" + PAN[3]);
		System.out.println("PAN CARD NO:" + PAN[4]);
		System.out.println("PAN CARD NO:" + PAN[5]);
		System.out.println("PAN CARD NO:" + PAN[6]);
		System.out.println("PAN CARD NO:" + PAN[7]);
		System.out.println("PAN CARD NO:" + PAN[8]);
		System.out.println("PAN CARD NO:" + PAN[9]);

		System.out.println();

		// Vehicle no
		String varsha1 = "KA 26 1234";
		String akshu1 = "KA 26 5678";
		String teju1 = "KA 26 9810";
		String chandu1 = "KA 26 1112";
		String sammi1 = "KA 26 1314";
		String sara1 = "KA 26 1516";
		String archi1 = "KA 26 1718";
		String laxmi1 = "KA 26 1920";
		String pooja1 = "KA 26 2122";
		String parshya1 = "KA 26 2324";

		String vehicle[] = { varsha1, akshu1, teju1, chandu1, sammi1, sara1, archi1, laxmi1, pooja1, parshya1 };

		System.out.println("Vehicle No:" + vehicle[0]);
		System.out.println("Vehicle No:" + vehicle[1]);
		System.out.println("Vehicle No:" + vehicle[2]);
		System.out.println("Vehicle No:" + vehicle[3]);
		System.out.println("Vehicle No:" + vehicle[4]);
		System.out.println("Vehicle No:" + vehicle[5]);
		System.out.println("Vehicle No:" + vehicle[6]);
		System.out.println("Vehicle No:" + vehicle[7]);
		System.out.println("Vehicle No:" + vehicle[8]);
		System.out.println("Vehicle No:" + vehicle[9]);

		System.out.println();

		// Passport no

		String varsha2 = "EHDU456F";
		String akshu2 = "AKSH345UW";
		String teju2 = "TEJU678NW";
		String chandu2 = "CHAN678DU";
		String sammi2 = "SAM8498MI";
		String sara2 = "SAR3993NA";
		String archi2 = "AR8389CHI";
		String laxmi2 = "LAX4838MI";
		String pooja2 = "POO8384JA";
		String parshya2 = "PAR8329SHY";

		String passport[] = { varsha2, akshu2, teju2, chandu2, sammi2, sara2, archi2, laxmi2, pooja2, parshya2 };

		for (int v = 0; v <= passport.length - 1; v++) {

			System.out.println("The passport No:" + passport[v]);

		}
		System.out.println();

		// gst no
		String varsha3 = "EHDU456F";
		String akshu3 = "AKSH345UW";
		String teju3 = "TEJU678NW";
		String chandu3 = "CHAN678DU";
		String sammi3 = "SAM8498MI";
		String sara3 = "SAR3993NA";
		String archi3 = "AR8389CHI";
		String laxmi3 = "LAX4838MI";
		String pooja3 = "POO8384JA";
		String parshya3 = "PAR8329SHY";

		String gst[] = { varsha3, akshu3, teju3, chandu3, sammi3, sara3, archi3, laxmi3, pooja3, parshya3 };

		for (int f = 0; f <= gst.length - 1; f++) {

			System.out.println("The GST NO:" + gst[f]);

		}

		System.out.println();

		// app version

		float a = 1.5f;
		float b = 2.6f;
		float c = 3.7f;
		float d = 4.8f;
		float e = 5.9f;
		float f = 6.10f;
		float g = 7.11f;
		float h = 8.12f;
		float i = 9.13f;
		float j = 1.15f;

		float version[] = { a, b, c, d, e, f, g, h, i, j };

		for (int s = 0; s <= version.length - 1; s++) {

			System.out.println("The app version is:" + version[s]);

		}

		System.out.println();

//		*Facebook IDs*

		String id[] = { "_akshata_warad", "vinutabadami_12", "bagya_vc1999", "varshakamble_23", "435tejuak_", "984hanu",
				"farin25#", "xyz", "subbu123", "varshhh" };

		for (int n = 0; n < id.length; n++) {

			System.out.println("Facebook ids are : " + id[n]);

		}

//		*Password*
		System.out.println();
		String password[] = { "1233", "1jjcdhj", "bchdbhxb", "cvsdcdsf", "gfteaguw", "bdhefcHW", "gdcgdui", "hdscygyet",
				"shdyeg", "sgdyg" };

		for (int u = 0; u < password.length; u++) {

			System.out.println("Password of each memeber is :" + password[u]);

		}

//		**Home address**
		System.out.println();
		String address[] = { "#33 ART nagar,hubli", "#23 Sahadev nagar,old hubli", "#22 Bharath nagar,hubli",
				"#98 BTM Banglore", "#45 xyz Keshwapur", "#123 Gokul road,Airport,gokul", "#234 Dollars colony,Hubli",
				"#67 JP nagar ,Bengaluru", "#89 SM layout,gadag", "#09 KUD,Dharwad" };

		for (int k = 0; k < address.length; k++) {

			System.out.println("address each memeber is :" + address[k]);

		}

//		*IFSC Code**
		System.out.println();
		String code[] = { "SYNB24667", "CAN676783", "SBI7467782", "CAN87845948", "HDFC75857", "SBI465656", "SBI9806766",
				"MHR6567687", "ICIC6768909", "SYN55343" };

		for (int t = 0; t < code.length; t++) {

			System.out.println("IFSC Code of each memeber is :" + code[t]);
		}

//		**spec model no*
		System.out.println();
		String model[] = { "12yhytuj", "16467jjcdhj", "75849bchdbhxb", "cvs64dcdsf", "gfteag678uw", "bdhef467cHW",
				"gdcg4656dui", "hd7685scygyet", "sh859dyeg", "sgdy4895g" };

		for (int z = 0; z < model.length; z++) {

			System.out.println("Specs Model is :" + model[z]);
		}
	}
}
