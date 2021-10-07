class IcecreamStarter{
	
	public static void main(String args[]){

Icecream cream;
 cream=new Icecream(-20,"Butterscotch",Color1.YELLOW);
System.out.println(cream.flavour);
System.out.println(cream.temp);
System.out.println(cream.color);


 cream.type="cone";
 System.out.println(cream.type);
cream.brand=new Brand();
Brand brand=new Brand("Akshata",1999);

System.out.println(brand.Ownername);
System.out.println(brand.location);
System.out.println(brand.since);


}
}