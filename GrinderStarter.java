class GrinderStarter{
public static void main(String args[]){

 Grinder grind=new Grinder(3,"Panasonic");
 System.out.println(grind.capacity);
 System.out.println(grind.company);
 
 

 Motor motor=grind.motor;
 
 System.out.println(motor.model);
 System.out.println(motor.rpm);
}
}