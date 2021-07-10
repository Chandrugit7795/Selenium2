package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicDropDwon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./src/divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//Login the URL		
		driver.get("http://triotend.com/tts/site/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("triotend");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-of-type(2)")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[id='add']")).click();
		Thread.sleep(3000);
		
	
		
		WebElement wb=driver.findElement(By.cssSelector("#formadd > div.row.row-eq > div.col-lg-8.col-md-8.col-sm-8 > div > div:nth-child(10) > div > select"));
		Select sc=new Select(wb);
		sc.selectByIndex(2);
		Thread.sleep(2000);
		sc.selectByValue("O+");
		Thread.sleep(3000);
		sc.selectByVisibleText("A+");
		Thread.sleep(2000);
		
		
		

	}

}
