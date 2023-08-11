package section16;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastexecution(){
		System.out.println("I will execute last"); //automation
		
	}
	
	@Test
	public void Demo(){
		System.out.println("hello"); //automation
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void afSuite(){
		System.out.println("I am the no 1 from last"); //automation
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
}
