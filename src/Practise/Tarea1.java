package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Tarea1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Instalador_JARs_Drivers\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Debería imprimirse como verdadero
		Thread.sleep(5000);
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Debería imprimir falso

		driver.findElements(By.cssSelector("input[value='checkbox']")).size();
		
		/*
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		*/
		
		//Count the number of checkboxes
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//driver.findElement(By.id("right-align")).click();
		//Thread.sleep(2000L);
		
		/*
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
			i++;
		}
		*/
		/*
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		*/
	}
}