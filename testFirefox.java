package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testFirefox {
	
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		System.out.println("Opening navigator in firefox...");
		driver.get("https://www.navigator.ba/#/categories");

		
		
		System.out.println("Waiting for 7 seconds");
		Thread.sleep(7000);
		
		System.out.println("Closing");
		
		driver.quit();
	 


	}

	
	
}
