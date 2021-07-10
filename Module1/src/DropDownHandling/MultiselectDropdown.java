package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./src/divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		WebElement wb=driver.findElement(By.cssSelector("#cars"));
		Select sc= new Select(wb);
		sc.selectByIndex(2);
		Thread.sleep(2000);
		sc.selectByValue("volvo");
		Thread.sleep(2000);
		sc.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sc.deselectAll();
		
		List<WebElement> el= driver.findElements(By.cssSelector("#cars"));
		
		for (WebElement web : el) 
		{
			web.click();
			//System.out.println(web.getText());
		}
	
	
	
	
	
	

	
	}

}
