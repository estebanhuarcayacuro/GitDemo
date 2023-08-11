package section14;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test3 {
	//Count the number of names starting with alphabet A in list
	//@Test
	public void regular() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Abhijeet");
	names.add("Don");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
	int count = 0;
	for (int i = 0; i < names.size(); i++) {
		String actual = names.get(i);
		if (actual.startsWith("A")) {
			count++;
			}
		}
	System.out.println(count);
	}
	
	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if inter op (filter) returns true
		//We can create stream
		//how to use filter in Stream API
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		//print all the names of ArrayList
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
}
