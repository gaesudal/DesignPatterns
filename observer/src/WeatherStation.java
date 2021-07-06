
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay =
				new CurrentConditionDisplay(weatherData);
		
		CurrentConditionDisplay currentConditionDisplay2 =
				new CurrentConditionDisplay(weatherData);
		
		
		
		weatherData.setMeasurements(80, 80, 30.4f);
		weatherData.setMeasurements(82, 20, 20.4f);
		System.out.println("============================================================");
		weatherData.removeObserver(currentConditionDisplay2);
		
		weatherData.setMeasurements(80, 50, 50.4f);
	}
}
