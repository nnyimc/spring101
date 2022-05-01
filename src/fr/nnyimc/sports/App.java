package fr.nnyimc.sports;

public class App {
	public static void main (String... args) {
		Coach firstCoach = new BaseballCoach();
		Coach secondCoach = new TrackCoach();
		System.out.println( firstCoach.getDailyWorkout() );
		System.out.println( secondCoach.getDailyWorkout() );
	}
}
