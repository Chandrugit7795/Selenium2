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

public class Sshotdemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./src/divers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("E:\\Chandru\\AUTOMATION TESTING\\JAVA\\New Java Workspace\\Module1\\Screenshot"+System.currentTimeMillis());
		
		
		FileHandler.copy(srcFile, destFile);

	}

}
