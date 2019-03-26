package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println("adad" + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://shopify.github.io/draggable/examples/simple-list.html");

		
		List<WebElement> List1 = getList();

		for (WebElement elem : List1) {
			System.out.println(elem.getText());
		}

		dragRowList(0,2);
		dragRowList(1,3);
		dragRowList(5,6);
		dragRowList(11,8);
		
		
		System.out.println("------------------------------------------");
		List<WebElement> List2 = getList();

		for (WebElement elem : List2) {
			System.out.println(elem.getText());
		}

		//Thread.sleep(5000);
		//driver.quit();
		//MASTER  //MASTER  //MASTER  //MASTER  //MASTER  //MASTER  
		//MASTER  //MASTER  //MASTER  //MASTER  //MASTER  //MASTER  
		//MASTER  //MASTER  //MASTER  //MASTER  //MASTER  //MASTER  
		//MASTER  //MASTER  //MASTER  //MASTER  //MASTER  //MASTER  

	}
	//0,1,2,3,5,9

	private static void dragRowList(int from, int to) throws InterruptedException {
		String css2 = "li.StackedListItem div.DragHandle";
		List<WebElement> listDrag = driver.findElements(By.cssSelector(css2));

		WebElement source = listDrag.get(from);
		WebElement target = listDrag.get(to);

		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		Thread.sleep(500);
	}

	public static List<WebElement> getList(){
		String css = "li.StackedListItem";
		List<WebElement> myList = driver.findElements(By.cssSelector(css));
		
		return myList;
	}

}
