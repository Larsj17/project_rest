package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * URL: https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x
 *
 */

@SpringBootApplication //kennzeichnet diese Klasse als Startpunkt für unsere App
public class CourseApiApp {

	public static void main(String[] args) {
		
		SpringApplication.run( CourseApiApp.class, args );
		//SpringApplication.run( Klasse wo der Startpunkt liegt, Commands die vom User gesendet werden );
	}
}
