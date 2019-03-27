package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println("adad" + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quackit.com/html/codes/html_radio_button.cfm");
		// System.out.println(driver.getTitle());

		driver.switchTo().frame("result2");

		List<WebElement> colorRadio = driver.findElements(By.name("preferred_color"));

		System.out.println(colorRadio.get(2).getAttribute("value"));
		System.out.println(colorRadio.get(2).getAttribute("checked"));
		colorRadio.get(2).click();
		System.out.println(colorRadio.get(2).getAttribute("checked"));

		// System.out.println(colorRadio.size());

		// for (int i = 0; i < colorRadio.size(); i++) {
		// colorRadio.get(i).click();
		// System.out.println(colorRadio.get(i).getAttribute("value"));
		// }

		driver.switchTo().defaultContent();

		driver.quit();
	}
}
