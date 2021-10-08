class SocialMediaAppStarter{

public static void main(String vars[]){

SocialMediaApp mediaapp=new SocialMediaApp();
mediaapp.setName("Instagram");
System.out.println(mediaapp.name);
mediaapp.setSize(49.0f);
System.out.println(mediaapp.size);
mediaapp.setLanguage("Java");
System.out.println(mediaapp.language);
mediaapp.setPlatform("Windows 10");
System.out.println(mediaapp.platform);
mediaapp.setVersion(4.8f);
System.out.println(mediaapp.version);

Company1 comp=new Company1();

mediaapp.setCompany(comp);



comp.setName("Facebook");
System.out.println(mediaapp.company);


System.out.println(mediaapp.company.name);

comp.setFounder("Mark Zuckerberg");
System.out.println(mediaapp.company.founder);

comp.setEst(1999);
System.out.println(mediaapp.company.est);

comp.setNoofEmployees(200);
System.out.println(mediaapp.company.noofemployees);

comp.setHeadQuarter("USA");
System.out.println(mediaapp.company.headquarter);

comp.setRevenue(8596.5f);
System.out.println(mediaapp.company.revenue);


comp.setNoofBranches(10);
System.out.println(mediaapp.company. noofBranches);






}




}