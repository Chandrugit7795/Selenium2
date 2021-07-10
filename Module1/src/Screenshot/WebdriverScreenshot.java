package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebdriverScreenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./src/divers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/ecom/my-account-2/");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("E:\\Chandru\\AUTOMATION TESTING\\JAVA\\New Java Workspace\\Module1\\Screenshot"+System.currentTimeMillis());
		FileHandler.copy(sourceFile, destFile);


	}

}
