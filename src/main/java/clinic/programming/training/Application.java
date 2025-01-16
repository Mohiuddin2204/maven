package clinic.programming.training;

import java.util.*;
import org.apache.commons.lang3.StringUtils;
public class Application {
    	public int countWords(String words){
		String[] sw=StringUtils.split(words,' ');
		return (sw == null) ? 0 : sw.length;
	}
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		for(String greeting: greetings){
			System.out.println("Greeting: "+ greeting);
		}
	}
	public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
	int c=app.countWords("Hello again stretford end");
	System.out.println("Count" + "  "+c);
    }
}
