package Casespage;


import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

import Pageobjects.Loginpageservicegeeni;
import Utilitieskey.Keyexcel;

public class Loginpagecase extends Keybase
{
  @Test(dataProvider="keydata")  

	public void loginpage(String username,String password) throws Exception {
		
	   
		
		Loginpageservicegeeni lp= new Loginpageservicegeeni(driver);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		driver.manage().window().maximize();
		
		if(driver.getCurrentUrl().equals("https://windsor.keyazure.co.uk/Home/Index")) {
			Thread.sleep(3000);
			Assert.assertTrue(true);
			
		}
		else {
			Assert.fail("Unsucessfull");
		
		}
	
	    lp.clickonstock();
	    lp.clickonstock1(); 
	    lp.hoveronsetting();
        lp.clickonsettings();
        lp.clickonselectbranch();
        lp.clickonselectbranch1();
        lp.clickonyes();
        lp.clickonstockenquiry();
        lp.addnewstock();
        lp.stockname();
        lp.enterdescription();
        lp.stockunitmenu();
        lp.selectstockunitoption();
        lp.generatecustomreference();
        lp.enterstockvariance();
        lp.clickondeafultbin();
        lp.selectdeafultbinlocation();
        lp.clickonsupplier();
        lp.selectonsupplier();
        lp.savestock();
        
        
}	
	
	@DataProvider(name="keydata")

	public Object[][] passData() throws Exception{
	Keyexcel al = new Keyexcel("C:\\Users\\swath\\eclipse-workspace\\KEYCOMPUTERS\\excelkey\\frameddt.xlsx");
	int rows=al.getRowcount(0);
	Object[][]data = new Object [rows][2];
	for(int i=0;i<rows;i++){
	data[i][0]=al.getCelldata(0, 0, i);
	data[i][1]=al.getCelldata(0, 1, i);
	}
	return data;


	}


}



