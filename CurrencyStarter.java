class CurrencyStarter{

public static void main(String args[]){

Currency currency=new Currency();
currency.name="dollar";
currency.value=50;

currency.displaydetails();
System.out.println();
currency.country=new Country();
Country country1=currency.country;
System.out.println(currency.country);
country1.name="India";
country1.code=1234;
country1.displaydetails();
System.out.println();


Company company=new Company();
company.name="Akshata";
company.ceo="Varshi";
company.cfo="sou";
company.displaydetails();
company.country=new Country();
System.out.println(company.country);


Application app=new Application();
app.name="Excel";
app.version=3.8f;
System.out.println();
app.displaydetails();
app.company=new Company();
System.out.println(app.company);


}



}