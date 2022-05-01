package fr.nnyimc.sports;

import fr.nnyimc.sports.services.WeatherService;

public class CricketCoach implements Coach {
	
	private WeatherService weatherService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {}
	
	public void setWeatherService(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
    
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getWeatherReport() {
		return weatherService.getWeather();
	}

}
