import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Exxxx {

	public static void main(String[] args) {
		
		ChromeOptions ch= new ChromeOptions();
		
		ch.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(ch);
		driver.get("http://triotend@gmail.com:triotend@triotend.com/tts/site/login");

	}

}
