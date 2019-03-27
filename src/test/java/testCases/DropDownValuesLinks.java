package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValuesLinks {
	public static void main(String[] args) throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println("adad" + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());

		// tagname value and lang

//		List<WebElement> optionsElements = driver.findElements(By.tagName("option"));
//		System.out.println("nb elemnts = "+optionsElements.size());
//		
//		for (int i = 0; i < optionsElements.size(); i++) {
//			//System.out.println(optionsElements.get(i).getText());
//			System.out.println(optionsElements.get(i).getAttribute("lang"));
//		}

		// tagname links
		WebElement footer = driver.findElement(By.className("footer"));

		List<WebElement> sublinksElements = footer.findElements(By.tagName("a"));
		System.out.println("nb elemnts = " + sublinksElements.size());

		for (int i = 0; i < sublinksElements.size(); i++) {
			// System.out.println(optionsElements.get(i).getText());
			System.out.println(sublinksElements.get(i).getAttribute("href"));
		}

		// List<WebElement> linksFooter = driver.findElements(By.tagName("a"));

		driver.quit();

	}
}
