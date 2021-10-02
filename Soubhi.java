class Soubhi{
	
	String hobbies;
	int age;
	String name;
	
	Soubhi(String a){
	this.hobbies=a;
	System.out.println(hobbies);
	}
	
	
	Soubhi(int b,String c){
		this("BHAGYA");
	this.age=b;
	this.name=c;
	System.out.println(age+name);
	}
	
	
	public static void main(String args[])
	{
		
		
		Soubhi sou2=new Soubhi(25,"Akshu");
		
		
	}

}