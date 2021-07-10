package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootRadio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/divers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=5.0_4");
		List<WebElement> wb=driver.findElements(By.cssSelector("#Radios1"));
		for (WebElement webElement : wb) 
		{	
			//webElement.click();
			System.out.println(webElement.getAttribute("value"));
			Thread.sleep(2000);
			
			  if(webElement.getAttribute("value").equals("declater")) 
			  {
				  webElement.click();
				  Thread.sleep(2000); 
			  }
			 
	}

}}
