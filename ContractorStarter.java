class ContractorStarter{

public static void main(String args[]){
Contractor contractor=new Contractor();
String name=contractor.getName();
System.out.println("The Contractor Name is "+name);
contractor.setWorking(true);
boolean working=contractor.getWorking();
System.out.println("The Contractor is Working "+working);
contractor.setPlant("Solar Cell");
String plant=contractor.getPlant();
System.out.println("The Plant is "+plant);
contractor.setSite("Chandapura");
String site=contractor.getSite();
System.out.println("The site is "+site);
contractor.setType(Type2.FIELD_CONTRACTOR);
Type2 type=contractor.getType();
System.out.println("The Contractor Type is "+type);



}



}