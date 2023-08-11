package section10;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Instalador_JARs_Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		String parentWindow=it.next();
		Thread.sleep(5000);
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}
}