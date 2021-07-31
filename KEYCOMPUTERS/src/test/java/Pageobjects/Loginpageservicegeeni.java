package Pageobjects;

import java.awt.Robot;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sun.glass.events.KeyEvent;

import Utilitieskey.keywait;

public class Loginpageservicegeeni extends keywait  {
	WebDriver driver;
	
	public Loginpageservicegeeni(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(id="username")
	WebElement txtusername;
	
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(xpath=".//*[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(css="a#header-module-stock")
	WebElement stock;
  
	@FindBy(css="a#header-module-stock")
	WebElement stock1;
	
	@FindBy(css="li.dropdown.hoverBlock")
	WebElement setting;
	
	@FindBy(css="li.dropdown.hoverBlock")
	WebElement settings;
	
	@FindBy(xpath=".//*[@title='Select Branch']")
	WebElement selectbranch;
	
	@FindBy(xpath="//div[@class='nav-right-segment']//li[30]")
	WebElement selectbranch1;
	
	@FindBy(xpath="//button[.='Yes']")
	WebElement yes;

    @FindBy(css=".grid-stack-item.home-tile-sec.grey-bg.othermodules.ui-draggable.ui-resizable.ui-resizable-autohide[data-gs-x='0'][data-gs-y='0']")
    WebElement stockenquiry;
    
    @FindBy(css="span.key-header-buttons-text")
    WebElement addstock;
    
    @FindBy(xpath="//input[@autocomplete='off']")
    WebElement name;
    
    @FindBy(xpath="//input[@name='Description']")
    WebElement description;
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]")
    WebElement stockunit;
    
    @FindBy(xpath="//td[@class='custom-StockingUnitId customwidth key-grid-column']")
    WebElement selctstockunit;
    
    @FindBy(xpath="//i[@class='fa fa-fw fa-refresh']")
    WebElement customerref;
    
    @FindBy(name="StockTakeVariance")
    WebElement stockvariance;
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]")
    WebElement defaultbin;
    
    @FindBy(xpath="//span[normalize-space()='100']")
    WebElement selectbinlocation;
    
    @FindBy(xpath="/html[1]/body[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]")
    WebElement primarysupplier;
    
    @FindBy(xpath="//span[normalize-space()='Test Supplier created in Sage200']")
    WebElement selectsupplier;
    
    @FindBy(id="btnSave")
    WebElement save;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
public void setusername(String username) {
	txtusername.sendKeys(username);
	}
public void setpassword(String password) {
	txtpassword.sendKeys(password);
}
public void clicksubmit() {
	btnLogin.click();
}

public void clickonstock() {
	Actions act=new Actions(driver);
	act.moveToElement(stock).perform();
}
public void clickonstock1() {
	stock1.click();
}
public void hoveronsetting() {
		Actions act=new Actions(driver);
		act.moveToElement(setting).perform();
	}
public void clickonsettings() {
	settings.click();
}
public void clickonselectbranch() {
	selectbranch.click();
}
public void clickonselectbranch1() {
	selectbranch1.click();
}
public void clickonyes() {
	yes.click();
}
public void clickonstockenquiry() {
	stockenquiry.click();
}
public void addnewstock() {
	addstock.click();
}
public String generateletter(int length){
    return RandomStringUtils.randomAlphabetic(length);
    }
public void stockname(){
    name.sendKeys("machine" +" - "+"Test" + " - " + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3));
}
public void enterdescription() {
	description.sendKeys("description for stock");
}
public void stockunitmenu() {
	stockunit.click();
}
public void selectstockunitoption() {
	selctstockunit.click();
}
public void generatecustomreference(){
	customerref.click();
}
public void enterstockvariance() throws Exception{
	stockvariance.sendKeys("2");
}
public void clickondeafultbin() {
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)","");
	//js.executeScript("arguments[0].scrollIntoView();", defaultbin);
	defaultbin.click();
}
public void selectdeafultbinlocation() throws Exception {
	selectbinlocation.click();
	
}
public void clickonsupplier() {
	primarysupplier.click();
}

public void selectonsupplier() throws Exception {
	selectsupplier.click();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_PAGE_UP);
	robot.keyRelease(KeyEvent.VK_PAGE_UP);
}

public void savestock() {
	save.click();
}
}
























