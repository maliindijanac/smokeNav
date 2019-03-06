package firefox;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreatePlace {

	
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
     	System.out.println("Opening navigator in firefox...");
		driver.get("https://www.navigator.ba/#/categories");

		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	    Thread.sleep(3000);

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    //find create place element
	    js.executeScript("document.getElementById('ember566').click()");
	     
	    //find "naziv" element and fill with "Vijecnica"
	    
	    js.executeScript("document.getElementById('poi_name').value='vijecnica'; ");
	   
	    //find "categories"
	    
	    js.executeScript("document.getElementByClassName('ember-view btn btn-small').click()");
	    
	    //select categories
	    
	    js.executeScript("document.getElementsByName('poi[categories][8])'); ");
	
	    
	    System.out.println("Waiting for 10 seconds");
	    Thread.sleep(10000);
	   
		
	     
	    
	     System.out.println("Closing");
		
		 driver.close();
		
		
	 


	}
	
	
	
	
}
