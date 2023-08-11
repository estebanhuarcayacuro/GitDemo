package msedgedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver exten -> Methods close get
		// Firefox - FirefoxDriver -> methods close get
		// safari SafariDrive -> methods close get
		// WebDriver methods + class methods
		
		// chromedriver.exe -> Chrome browser
		
		//Microsoft Edge
		System.setProperty("webdriver.edge.driver", "D:\\Instalador_JARs_Drivers\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
	}

}
