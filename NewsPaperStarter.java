package com.xworkz.override;

import com.xworkz.override.objectClasses.NewsPaper;

public class NewsPaperStarter {

	public static void main(String[] args) {
		
		NewsPaper news=new NewsPaper();
		
		String news1=news.toString();
		System.out.println(news1);
		
		int news2=news.hashCode();
		System.out.println(news2);

		NewsPaper news3=new NewsPaper();
		
		news.setLang("English");
		news3.setLang("English");
		
		news.setName("Deccan");
		news3.setName("Deccan");
		
		System.out.println(news.equals(news3));
	}

}
