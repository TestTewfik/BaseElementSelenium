package testCases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println("adad" + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.icicibank.com");

		// https://shopify.github.io/draggable/examples/simple-list.html

		driver.findElement(By.xpath("//*[text()='Allow']")).click();
		driver.findElement(By.linkText("Terms & Conditions")).click();
		driver.findElement(By.xpath("//h2/span[text()='Personal Banking']")).click();
		;
		driver.findElement(By.xpath("//a[contains(text(),'Offer - Get Rs.250 BookMyShow')]")).click();

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.findElement(By.id("plugin")).getText());
		Thread.sleep(5000);

		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.navigate().back();

		Thread.sleep(5000);
		driver.quit();

	}
}
