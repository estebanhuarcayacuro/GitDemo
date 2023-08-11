package section13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Instalador_JARs_Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// driver.manage().deleteCookieName("sessionKey");
		// click on any link
		// login page- verify login url
		
		driver.get("http://google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\UDEMY\\CERTIFICACIONES\\QA\\Automatización 2 - Selenium WebDriver with Java - Basic to Advanced + Framework\\Sección 13\\TakesScreenshot\\screenshot.png"));
	}
}