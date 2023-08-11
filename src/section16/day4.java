package section16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname){
		//selenium
		System.out.println("webloginhomePersonalloan");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan(){
		//Appium
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan(){
		//Rest API automation
		System.out.println("APIloginHome");
	}
}
