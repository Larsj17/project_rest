package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greetingtest") 
public class GreetingController {

	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting") //läge jetzt bei /greetingtest/greeting
	public @ResponseBody GreetingClass greeting(
			@RequestParam(value="name", required=false, defaultValue="World") String name) {
		
		return new GreetingClass(counter.incrementAndGet(), String.format(template, name));
	} 
	
	/*
	 * @Controller
	 * annotiert das es sich um eine Controller Klasse handelt
	 * 
	 * Eine Controller Klasse ist 
	 */
	
	/*
	 * @RequestMapping
	 * Wird auf Klassen- und Methodenebene benutzt
	 * 
	 * Auf Klassenebene wird eine URI erstellt auf dem der Controller liegt
	 * 
	 * Auf Methodenebene wo die Methode liegt, auf welcher URI
	 */
	
	/*
	 * @RequestMapping("/greeting")
	 * 
	 * die Controller Klasse, hier GreetingController, liegt auf der URI /greeting
	 */
	
	/*
	 * @RequestMapping(method = RequestMethod.GET)
	 * 
	 * nur GET Anfragen wird von der annotierten Methode verarbeitet
	 */
	
	/*
	 * @ResponseBody
	 * annotiert Anfragen bearbeiter (request handler) Methoden
	 * 
	 * wird in Methoden-Kopf annotiert
	 * 
	 * konvertiert das Rückgabe-Object in einen Response Body mittels HttpMessageConverter
	 */
	
	/*
	 * @RequestParam
	 * mappt die URL parameter die mitgeliefert werden können auf die Methoden argumente
	 */
}
