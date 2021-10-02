class Sword{
String Cut;


static void Cut(){
System.out.println("invoked Cut");
}


void Fight(){
System.out.println("invoked Fight");
this.Cut();

} 
}