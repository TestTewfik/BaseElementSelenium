package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssAutomation2 {

	public static void main(String[] args) throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println("adad" + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.cssSelector("td > a[href*='mercuryregister']")).click();
		// driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("tewfik");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Titcho");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("32164987");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("tewfik@test.com");

		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("419875, rue ABC");
		driver.findElement(By.cssSelector("input[name='address2']")).sendKeys("App 547");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("ALgerie");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Quebec");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("H4K 1M5");

		WebElement coutries = driver.findElement(By.cssSelector("td > select"));
		Select select = new Select(coutries);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("FRENCH SOUTHERN AND ANTARCTIC LANDS");
		System.out.println(select.getFirstSelectedOption().getText());

		Thread.sleep(1000);
		driver.close();
		driver.quit();

	}
}
