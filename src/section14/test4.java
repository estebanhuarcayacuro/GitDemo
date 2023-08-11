package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test4 {
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
	
	//@Test
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
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

	@Test
	public void streamMap() {
		
		//print names which have last letter as "a" with Uppercase
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		System.out.println();
		
		//print names which have first letter as a with uppercase and sorted
		List<String> names = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
}
