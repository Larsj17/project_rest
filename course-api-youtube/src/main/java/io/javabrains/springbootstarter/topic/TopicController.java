package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired //wenn er sieht, dass topicService eine Insanz hat, dann tut er das hier in die variable
	private TopicService topicService;
	
	//GET-REQUEST
	@RequestMapping( "/topics" ) //kein GET, da Default
	public List<Topic> getAllTopics() { //erzeugt die Daten im Jason Format
		
		return topicService.getAllTopics();
	}
	
	//GET-REQUEST
	@RequestMapping( "/topics/{id}" ) //das was übergeben wird, bzw. was der User sehen möchte
	public Topic getTopic( @PathVariable String id ) { //@PathVariable sagt Spring das {id} die erwartete id ist
		
		return topicService.getTopic( id );
	}
	
	//POST-REQUEST
	@RequestMapping( method=RequestMethod.POST, value="/topics" ) //mappe diese Methode zu alle POST-Requests auf /topics 
	public void addTopic( @RequestBody Topic topic ) { //konvertiert den RequestBody zu einem Topic
		
		topicService.addTopic( topic );
	}
	
	//PUT-REQUEST
	@RequestMapping( method=RequestMethod.PUT, value="/topics/{id}" ) //ändert für die spezielle ID, das Topic bzw. den Inhalt des Topics
	public void updateTopic( @RequestBody Topic topic, @PathVariable String id ) { 
		
		topicService.updateTopic( id, topic );
	}
	
	//DELETE-REQUEST
	@RequestMapping( method=RequestMethod.DELETE, value="/topics/{id}" )
	public void deleteTopic( @PathVariable String id ) {
		
		topicService.deleteTopic( id );
	}
}
