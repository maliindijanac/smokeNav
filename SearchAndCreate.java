import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchAndCreate {
	public static  WebDriver driver;
	
 static void Search () throws InterruptedException {
	//unesi ime u search
	
    driver.findElement(By.xpath("//input[@class='ember-view ember-text-field tt-query']")).sendKeys("Vijecnica");
 
    Thread.sleep(1000);
    
    Actions clickEnter = new Actions (driver);
     
    clickEnter.sendKeys(Keys.ENTER).build().perform();

    //choose  option
    
    driver.findElement(By.xpath("//div[@title='Gradska vijeænica']")).click();
 
    Thread.sleep(10000);
	
}
 
 
 
 static void Create2 () throws InterruptedException {
 
 driver.findElement(By.xpath("//span[@class='icon iconav-plus']")).click();
	
 //find naziv field
 
 driver.findElement(By.id("poi_name")).sendKeys("test");
 driver.findElement(By.id("poi_city_name")).sendKeys("Sarajevo");
 driver.findElement(By.id("poi_place_id")).sendKeys("NIkole Sopa");
 
 
 driver.findElement(By.xpath("//span[@style='position: absolute; top: 100%; left: 0px; z-index: 100; display: block; right: auto;']")).click();
 

 
 driver.findElement(By.id("poi_description")).sendKeys("Coffee place");
 
 //find categories
 driver.findElement(By.xpath("//button[@class='ember-view btn btn-small']")).click();
 
 //select categories
 
 driver.findElement(By.xpath("//div[@class='ember-view category-selector-view']//option[@value='5']")).click();
 driver.findElement(By.xpath("//div[@class='span3']//option[@value='53']")).click();
 
 
 JavascriptExecutor jse = (JavascriptExecutor)driver;
 jse.executeScript("document.getElementsByClassName(\"mCSB_container\")[0].setAttribute(\"style\",\"position: relative; top: -980px;\");");

 

 
 //click kreiraj
 driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
 
}

public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();

		
        driver.get("https://www.navigator.ba/#/categories");
		
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		Search();
		Create2();
		
		
		  Thread.sleep(10000);
		  
       driver.close();
         };
        
        
}

