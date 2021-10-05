class ForestStarter{
public static void main(String args[]){

Forest obj1=new Forest("Bandipur",true);

System.out.println(obj1.name);
System.out.println(obj1.reserved);
obj1.location="Chamrajnagar";
System.out.println(obj1.location);
System.out.println(obj1.state);

obj1.state=new State("BLR",29);
State state1=obj1.state;
System.out.println(obj1.state);
System.out.println();
System.out.println(state1.name);
System.out.println(state1.noofdis);
System.out.println(state1.cmname);
System.out.println(state1.CapCity);


state1.CapCity=new CapitalCity("k","Tigers");
CapitalCity cap=state1.CapCity;
System.out.println(state1.CapCity);
System.out.println();
System.out.println(cap.name);
System.out.println(cap.famousfor);
System.out.println(cap.population);



}

}