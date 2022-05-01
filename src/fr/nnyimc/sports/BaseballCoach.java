package fr.nnyimc.sports;

import fr.nnyimc.sports.services.WeatherService;

public class BaseballCoach implements Coach {
	
	private WeatherService weatherService;
	
	public BaseballCoach() {}
	public BaseballCoach(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getWeatherReport() {
		return weatherService.getWeather();
	}
}
