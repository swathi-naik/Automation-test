package practisemavenjenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mavenjenkin {
	@Test
	public void newmethod() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\eclipse-workspace\\practisemavenjenkin\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.youtube.com");
    String text=  driver.getTitle();
    System.out.println("title is"+text );
    driver.quit();

}
}