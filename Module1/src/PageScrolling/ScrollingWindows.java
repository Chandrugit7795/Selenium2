package PageScrolling;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ScrollingWindows {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./src/divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=5.0_4");
		Thread.sleep(3000);
		Actions act= new Actions(driver);
		
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		

	}

}
