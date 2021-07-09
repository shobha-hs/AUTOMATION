package bestbuy.oma;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjectmodel.objamzonpage;
import resource.BaseUtil;

public class AmazonPage extends BaseUtil {
	
	
	@Test( enabled = true )
	public void amzonLogin() throws IOException, InterruptedException {

		driver = initializedriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objamzonpage objamazonpage = new objamzonpage(driver);		
		objamazonpage.btnHomePageSigin().click();
		objamazonpage.txtEmailMobilePhoneNumber().sendKeys("8050191820");
		objamazonpage.btnSiginContinue().click();
		objamazonpage.txtPassword().sendKeys("shobha123");
		objamazonpage.btnSignIn().click();
		String strUserName = objamazonpage.userDisplayNameHomePage().getText().substring(11);
	//	Assert.assertTrue("Shobha".equalsIgnoreCase(strUserName));		
		Assert.assertTrue(false);
		
	}
	
	

	@Test( enabled = true )
	public void amazonbeautyproductclk() throws IOException, InterruptedException {
		
	
	}
	
}
