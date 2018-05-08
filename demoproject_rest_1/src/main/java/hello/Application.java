package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/*
	 * @ComponentScan
	 * erlaubt Spring zu wissen welche Pakete für die annotierten Komponenten zu scannen sind
	 */
	
	/*
	 * EnableAutoConfiguration
	 * normalerweise in der MAIN-Klasse
	 * 
	 * Es werden beans hinzugefügt, auf Grundlage von Classpath settings, anderen BEANS und verschiedenen Settings
	 */
	
	//Beans enthalten Configuration-Metadaten
	//Was sind Beans genau?
}
