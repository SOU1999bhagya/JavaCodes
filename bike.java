class bike{
	
	int age;
	
bike(){
int a=5;
System.out.println(a);
}

bike(int a){
	
	this.age=a;
	System.out.println(a);
}
bike(String name){
	
	System.out.println(name);
}

bike(String state,int no){
	this("ktm");
	System.out.println(state+" "+no);
}

public static void main(String a[]){
bike b=new bike();
bike b0=new bike(7);
bike b2=new bike("hy7h",1234);
}
}