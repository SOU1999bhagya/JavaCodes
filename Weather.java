class Weather{
static int instance=0;
float tempincelsius=27.0f;
String Humidity;
WeatherSeason season;
boolean feel;

	Weather(WeatherSeason season,String Humidity)
	{
	instance++;
	this.season=season;
	this.Humidity=Humidity;
	}
}