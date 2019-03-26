package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("adad"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath +"/src/test/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.ca");
		System.out.println(driver.getTitle());
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
