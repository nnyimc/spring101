package fr.nnyimc.sports;

import fr.nnyimc.sports.services.WeatherService;

public class TennisCoach implements Coach {

	private WeatherService weatherService;
	
	public TennisCoach() {}
	
	
	public TennisCoach(WeatherService weatherService) {
		this.weatherService = weatherService;
	}


	@Override
	public String getDailyWorkout() {
		return "Hit 25 aces.";
	}

	@Override
	public String getWeatherReport() {
		return weatherService.getWeather();
	}

}
