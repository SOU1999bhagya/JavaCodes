class Grinder{
int capacity;
String company;
Motor motor=new Motor();


Grinder(int capacity,String company){

    this.capacity=capacity;
	this.company=company;
	System.out.println("invoked int and String");

}
}