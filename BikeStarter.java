class BikeStarter{

public static void main(String args[]){

Bike bike=new Bike();
bike.setName("Pulsar");
String name=bike.getName();
System.out.println("The Bike Name is "+name);
bike.setPrice(4500.8f);
float price=bike.getPrice();
System.out.println("The price of bike is "+price);




}
}