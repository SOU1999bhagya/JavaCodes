class MiPhoneStarter{

public static void main(String args[]){

MiPhone miphone=new MiPhone();
miphone.setModelName("Mi 11x");
System.out.println(miphone.modelName);
miphone.setPrice(2500.0f);
System.out.println(miphone.price);
miphone.setColour("Black");
System.out.println(miphone.colour);
miphone.setImei(06);
System.out.println(miphone.imei);

PhonePay phonepay=new PhonePay();
miphone.setPhonepay(phonepay);

phonepay.setCompany("Chinese Company");
System.out.println(phonepay.company);

phonepay.setVersion(4.8f);
System.out.println(phonepay.version);

phonepay.setArchitect("Varsha");
System.out.println(phonepay.architect);

phonepay.setWorking(true);
System.out.println(phonepay.working);




}


}