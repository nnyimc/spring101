package fr.nnyimc.sports;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Coach firstCoach = context.getBean("baseballCoach", Coach.class);
		System.out.println( firstCoach.getDailyWorkout() );
		System.out.println( firstCoach.getWeatherReport() );
		
		Coach secondCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println( secondCoach.getDailyWorkout() );
		System.out.println( secondCoach.getWeatherReport() );
		
		Coach thirdCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println( thirdCoach.getWeatherReport() );
		
		context.close();
		
	}

}
