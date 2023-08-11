package section16;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void befoclas() {
		System.out.println("before executing any methods in the class");
	}
	
	@Parameters({"URL", "APIKey/usrname"})
	@Test
	public void WebloginCarLoan(String urlname, String key){
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery(){
		//selenium
		System.out.println(" I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery(){
		//Appium
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void afterclass(){
		//Appium
		System.out.println("After executing all methods in the class");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan(){
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	@BeforeTest
	public void Bfsuite(){
		//Appium
		System.out.println("I am no I");
	}
	
	@Test(enabled=false)
	public void MobilesignimcarLoan(){
		//Appium
		System.out.println("Mobile SIGIN");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String username, String password){
		//Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"WebloginCarLoan", "MobilesignoutcarLoan"})
	public void APIcarLoan(){
		//Rest API automation
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1st combination - username paswword - good credit history = row
		// 2nd - username password - no credit history
		// 3rd - fraudelent credit history
		
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}
