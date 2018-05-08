package hello;

public class GreetingClass {

	private final long id;
	private final String content;
	
	public GreetingClass(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getID() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
}
