package Casespage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;



public class Keybase  {
public static WebDriver driver;
    
    
    
	@BeforeTest
	
	public void setup() throws Exception 
	{
	    
	    
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\eclipse-workspace\\KEYCOMPUTERS\\drivers\\chromedriver.exe");
	    
	     driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://windsor.keyazure.co.uk");
	    Thread.sleep(5000);
	   
	    }
	    
	    
	   
	//@AfterTest
	//public void teardown() {
	//driver.quit();
	//}
	

}



