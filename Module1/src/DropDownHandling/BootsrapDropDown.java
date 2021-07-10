package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootsrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/divers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		Thread.sleep(3000);

		
		
			driver.findElement(By.cssSelector(".multiselect-selected-text")).click();
		  List<WebElement>lwb=driver.findElements(By.cssSelector(".multiselect-container>li"));
		  
		  //Select sc= new Select((WebElement) lwb); //System.out.println(lwb.size());
		  
		  
		  
		  
		  for (WebElement ww : lwb) { 
		//	  if(ww.getText().equals(" Bootstrap Tips"))
			 
		
		  ww.click(); 
		  Thread.sleep(2000);
		  ww.click();
		  }
		 

	}

}
