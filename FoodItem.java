class FoodItem{
String name;
int items;
float price;
String HotelName;
int quantity;
float rating;
Type type;
OrderType ordertype;

void displayDetails(){

System.out.println(this.name);
System.out.println(this.price);
System.out.println(this.HotelName);
System.out.println(this.quantity);
System.out.println(this.type);
System.out.println(this.rating);
System.out.println(this.ordertype);
System.out.println(this.items);

}
void PrintTotalPrice(){
	float totalprice=this.quantity*this.price;
	System.out.println("Total Price: " +totalprice);
	
}
void printTotalFoodItemsPrice(){
	float totalFoodItemsPrice=this.items*this.price*this.quantity;
	System.out.println("Total Food Items Price:" +totalFoodItemsPrice);
	
}
void printHotelName(){
	String hotelName=this.HotelName;
	System.out.println("Hotel Name: "+hotelName);
	
}
void printNameandPrice(){
	String name1=this.name;
	float price1=this.price;
	System.out.println("Food Name:"+name1);
	System.out.println();
	System.out.println("Price of The Food:"+price1);
	
}
}