package firefoxdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver exten -> Methods close get
		// Firefox - FirefoxDriver -> methods close get
		// safari SafariDrive -> methods close get
		// WebDriver methods + class methods
		
		// chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.gecko.driver", "D:\\Instalador_JARs_Drivers\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
