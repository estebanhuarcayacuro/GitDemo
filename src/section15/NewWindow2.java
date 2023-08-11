package section15;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Instalador_JARs_Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses'"))
				.get(1).getText();
		Thread.sleep(5000);
		driver.switchTo().window(parentWindowId);
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		File file = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		//driver.quit();
		
		//GET Height & Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
