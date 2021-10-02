class Shop{
public Shop(){
System.out.println("Default Constructor");
}
public Shop(String name){

System.out.println(" the name is " +name);
}

public Shop(boolean a){
	this(Bhagya);
System.out.println("The shop is opened " +a );

}
public static void main(String args[]){
Shop obj=new Shop("bhagya");
Shop obj1=new Shop(true);
}
}