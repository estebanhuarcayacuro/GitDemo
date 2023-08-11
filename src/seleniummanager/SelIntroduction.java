package seleniummanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//SeleniumManager (Beta phase), significa que podemos evitar este paso "System.setProperty(..." porque el gestor manager lo realiza por defecto
		
		//da igual usarlo, si lo dejamos sucede que se desactiva el gestor y se aplica la linea de codigo
		//System.setProperty("webdriver.chrome.driver", "D:\\Instalador_JARs_Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
