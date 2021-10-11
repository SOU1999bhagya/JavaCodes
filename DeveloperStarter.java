class DeveloperStarter{
	public static void main(String args[]){
		Developer developer=new Developer();
		developer.setName("Soubhagya");
		String name=developer.getName();
		System.out.println(name);
		developer.setLanguage("Java");
		String language=developer.getLanguage();
		System.out.println(language);
		developer.setSalary(35000.56d);
		double salary=developer.getSalary();
		System.out.println(salary);
		developer.setProjects(4);
		int projects=developer.getProjects();
		System.out.println(projects);
		developer.setRole("Team Leader");
		String role=developer.getRole();
		System.out.println(role);
	}
}