class WeatherRunner{
	public static void main(String args[]){
		WeatherSeason season=WeatherSeason.SUMMER;
		String Humidity="cloudy";
		Weather weather=new Weather(season,Humidity);
		weather.feel=true;
		System.out.println(weather.season);
		System.out.println(weather.tempincelsius);
		System.out.println(weather.Humidity);
		System.out.println(weather.feel);
		System.out.println(Weather.instance);
	}
}