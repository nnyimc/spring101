package fr.nnyimc.sports.services;

import java.util.Random;

public class RandomWeather implements WeatherService {
	
	private String[] weatherFortunes;
	
	public RandomWeather() {
		
	}
	
	public void setWeatherFortunes (String[] weatherFortunes) {
		this.weatherFortunes = weatherFortunes;
	}
	
	@Override
	public String getWeather() {
		Random random = new Random();
		return weatherFortunes[random.nextInt(weatherFortunes.length)];
	}

}
