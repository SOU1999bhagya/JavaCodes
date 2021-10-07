class Product{
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	static float totalProductsPrice;
	
	void displayDetails(String name,String type,float price,int quantity,String vendor){
		
		System.out.println(this.name=name);
		System.out.println(this.type=type);
		System.out.println(this.price=price);
		System.out.println(this.quantity=quantity);
		System.out.println(this.vendor=vendor);
	}
	
	void printTotalCost(){
		float total=price*quantity;
		System.out.println("Total Cost : "+total);
		totalProductsPrice=totalProductsPrice+total;
		System.out.println("Total Product Cost : "+totalProductsPrice);
	}
	
}