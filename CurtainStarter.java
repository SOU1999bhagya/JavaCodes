class CurtainStarter{

public static void main(String args[]){

Curtain curtain=new Curtain();
String color=curtain.getColor();
System.out.println("The Curtain Color is "+color);
curtain.setQuality(true);
boolean quality=curtain.getQuality();
System.out.println("The Quality of Curtain is "+quality);
curtain.setType(ClothType.NYLON);
ClothType type=curtain.getType();
System.out.println("The Cloth Type of curtain is "+type);
curtain.setPrice(109.5f);
float price=curtain.getPrice();
System.out.println("The curtain price is "+price);
String rating=curtain.getRating();
System.out.println("The rating of curtain is "+rating);
}


}