package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;



public class TestSearch {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
     	System.out.println("Opening navigator in firefox...");
		driver.get("https://www.navigator.ba/#/categories");

		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	     Thread.sleep(3000);
	
	   
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.getElementsByClassName('ember-view ember-text-field tt-query')[0].click()");
	    js.executeScript ("document.getElementsByClassName('ember-view ember-text-field tt-query')[0].value='Vijecnica';");
	    js.executeScript ("document.getElementsByClassName('iconav-search')[0].click()");
	    
	    
	    Thread.sleep(10000);
	    System.out.println("Waiting for 10 seconds");
		
	     
	    
	     System.out.println("Closing");
		
		 driver.close();
		
		
	 


	}


}
