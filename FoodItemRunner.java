class FoodItemRunner{

public static void main(String args[]){

FoodItem fooditem=new FoodItem();
System.out.println("Details of Food Item");
System.out.println();
fooditem.name="Noodles";
fooditem.price=250.0f;
fooditem.HotelName="Paradise";
fooditem.quantity=2;
fooditem.rating=3.5f;
fooditem.items=1;
fooditem.type=Type.CHINESE;
fooditem.ordertype=OrderType.ONLINE;
fooditem.displayDetails();
FoodItem fooditem1=new FoodItem();
System.out.println();
fooditem.PrintTotalPrice();
System.out.println();
fooditem.printTotalFoodItemsPrice();
System.out.println();
fooditem.printHotelName();
System.out.println();
fooditem.printNameandPrice();





}



}