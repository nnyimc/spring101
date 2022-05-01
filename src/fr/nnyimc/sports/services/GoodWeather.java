package fr.nnyimc.sports.services;

public class GoodWeather implements WeatherService {

	@Override
	public String getWeather() {
		return "The sun is shining!";
	}

}
