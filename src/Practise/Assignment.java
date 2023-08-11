package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Instalador_JARs_Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String text = "Rahul";
		driver.findElement(By.id("name")).sendKeys(text );
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}

}
