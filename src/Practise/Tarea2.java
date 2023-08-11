package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Tarea2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Instalador_JARs_Drivers\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		driver.findElement(By.name("name")).sendKeys("Esteban Huarcaya Curo");
		driver.findElement(By.name("email")).sendKeys("estebanhuarcayacuro@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Male");

		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("25/04/2023");
		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success.alert-dismissible")).getText());
		//alert alert-success alert-dismissible
		//.alert-success
		 
		 
		
		/*
		driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid'] [@name='name']")).sendKeys("Mahi");

		driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid'] [@name='email']")).sendKeys("mahi123@gmail.com");

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Mahi1211");

		driver.findElement(By.id("exampleCheck1")).click();

		driver.findElement(By.id("exampleFormControlSelect1"));

		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByIndex(0);

		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.xpath("//input [@class='form-control'] [@name='bday']")).sendKeys("08-10-1990");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class='btn btn-success']  ")).click();

		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		*/
	}
}