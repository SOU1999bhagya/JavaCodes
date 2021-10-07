class ProductStarter{
	public static void main(String args[]){
		Product product=new Product();
		product.displayDetails("Vessel","steel",3.0f,5,"Tejaswini");
		product.printTotalCost();
		
		Product product1=new Product();
		product1.displayDetails("Chair","Plastic",2.0f,2,"Akshata");
		product1.printTotalCost();
		
		
		Product product2=new Product();
		product2.displayDetails("Table","fibre",2.0f,1,"Varsha");
		product2.printTotalCost();
	}

}