package chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver exten -> Methods close get
		// Firefox - FirefoxDriver -> methods close get
		// safari SafariDrive -> methods close get
		// WebDriver methods + class methods
		
		// chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Instalador_JARs_Drivers\\Drivers\\chromedriver.exe");
		
		//webDriver.chrome.driver -> value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
		System.out.println("postJira");
		System.out.println("postJira2");
		System.out.println("postJira3");
	}

}
