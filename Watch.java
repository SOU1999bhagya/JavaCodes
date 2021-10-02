class Watch{
   
   int model;
   String brand;
   Light light=new Light();


Watch(int model,String brand){
    this.model=model;
	this.brand=brand;
System.out.println("invoked int and String");	
}
}
