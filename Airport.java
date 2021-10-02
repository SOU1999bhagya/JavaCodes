class Airport{
	
Airport(){
System.out.println("This is Airport Constructer");
System.out.println();
}

Airport(String Aname,String loc){
	System.out.println("Airport Name "+Aname);
}

Airport(float departure,float take_off){
	System.out.println("Departure Time "+departure+" Take off "+take_off);
}

Airport(int no_of_workers){
	System.out.println("Number of workers "+no_of_workers);	
}

public static void main(String airport[]){

	Airport a1 = new Airport();
	a1.Airport("Sri Siddharudha Airport","Hubli");
	a1.Airport(3.0f,6.0f);
	a1.Airport(40);
	
	
}
}