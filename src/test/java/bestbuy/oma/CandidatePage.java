package bestbuy.oma;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.objCandidatePage;
import pageobjectmodel.HomePage;
import pageobjectmodel.objhomepage;
import pageobjectmodel.SignPage;
import resource.BaseUtil;

public class CandidatePage extends BaseUtil {

	private static final Logger logger = LogManager.getLogger(CandidatePage.class.getName());
	public WebDriver driver;

	@Test()
	public void addcandidate() throws IOException, InterruptedException {
		String txtnewlycreatedemployee= null;
		driver = initializedriver();
		wait = new WebDriverWait(driver, 50);
		objhomepage obj_homepagepeople = new objhomepage(driver);
		objCandidatePage obj_addcandidatepage = new objCandidatePage(driver);
		obj_homepagepeople.lnkquickadd().click();
		obj_homepagepeople.lnkonboarding().click();
		obj_homepagepeople.lnkcandidate().click();		
		obj_addcandidatepage.txtemailid().sendKeys("mamatiohamamitha.pm@gmail.com");
		obj_addcandidatepage.txtfirstname().sendKeys("Shobhashovarudraiah");
		obj_addcandidatepage.txtlastname().sendKeys("HS");
		obj_addcandidatepage.webcountry().click();
		obj_addcandidatepage.txtcountryname().sendKeys("India");
		obj_addcandidatepage.txtcountryname().sendKeys(Keys.ENTER);
		obj_addcandidatepage.txtphonenumber().sendKeys("8050191829");
		obj_addcandidatepage.txtofficialemailid().sendKeys("mamatha@oracle.com");
		obj_addcandidatepage.txtempphoto().sendKeys("E:\\download.jpg");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"afterUpload\"] //div[contains(text(),\"jpg\")]")));
		obj_addcandidatepage.txtstreetaddress().sendKeys("SIT Extension");
		obj_addcandidatepage.txtstate().sendKeys("karnataka");
		obj_addcandidatepage.txtcity().sendKeys("Bangalore");
		Select countryname = new Select(obj_addcandidatepage.selectlistcountry());
		countryname.selectByVisibleText("INDIA");
		obj_addcandidatepage.txtexperienece().sendKeys("4");
		obj_addcandidatepage.txtcurrentsalary().sendKeys("800000");
		Select sourceofhire = new Select(obj_addcandidatepage.selectsourceofhire());
		sourceofhire.selectByVisibleText("Newspaper");
		obj_addcandidatepage.txtareaskillset().sendKeys("UFT" + "Selenium" + "API Testing");
	    obj_addcandidatepage.btnsubmitaddcandidate().click();
		obj_addcandidatepage.btnclose().click();
	    Thread.sleep(6000);
		List<WebElement> rowcount = driver.findElements(By.xpath("//*[@id='zp_views_records_table']/tbody/tr/td[6]"));
		for (int i = 0; i < rowcount.size(); i++) {
			txtnewlycreatedemployee = driver.findElements(By.xpath("//*[@id='zp_views_records_table']/tbody/tr/td[6]")).get(i).getText();
			if (txtnewlycreatedemployee.equalsIgnoreCase("Shobhashovarudraiah")) {
				break;
			}
		} 
				
		Assert.assertEquals(txtnewlycreatedemployee, "Shobhashovarudraiah");
		logger.info("New Employee added successfully");

	}

	@Test(enabled=true)
	public void CustomizeWidgets() throws IOException, InterruptedException {
		
		driver = initializedriver();
		logger.info("Landed to zoho.com successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage obj_homepage = new HomePage(driver);
		SignPage obj_signpage = new SignPage(driver);
		objhomepage obj_homepagepeople = new objhomepage(driver);

		/*
		 * obj_homepage.lnksignin().click(); obj_signpage.txtloginname().clear();
		 * obj_signpage.txtloginname().sendKeys("shobhashivarudraiah@gmail.com");
		 * obj_signpage.btnnext().click(); obj_signpage.txtpwd().clear();
		 * obj_signpage.txtpwd().sendKeys("*080Tiger*"); obj_signpage.btnnext().click();
		 * obj_signpage.lnkpeopleselection().click();
		 */

		List<WebElement> dashboard = obj_homepagepeople.dashboardtittle();
		int beforecustomize = dashboard.size();
		obj_homepagepeople.customizewidgets().click();
		obj_homepagepeople.webbirthday().click();
		Thread.sleep(10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", obj_homepagepeople.billable_nonbillable());
		Thread.sleep(10000);
		obj_homepagepeople.billable_nonbillable().click();
		obj_homepagepeople.widgetclose().click();
		List<WebElement> dashboard1 = obj_homepagepeople.dashboardtittle();
		int aftercustomize = dashboard1.size();
		Assert.assertEquals(beforecustomize, aftercustomize);
		logger.info("Testcase is passed successfully");

	}
	
	@Test()
	public void IteratorhashSet()
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("INDIS");
		hs.add("BRAZIL");
		System.out.println(hs);
		
		
	}
	
	
	

	@Test()
	public void create_candidate_view() throws IOException, InterruptedException {
		
		String[] selectcolumn = {"Photo","Candidate ID","First name","Last name"};
		int count = 0;
		List<String> objarraylsit = new ArrayList<String>();
		objarraylsit = Arrays.asList(selectcolumn);
		driver = initializedriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhomepage obj_homepagepeople = new objhomepage(driver);
		objCandidatePage obj_addcandidatepage = new objCandidatePage(driver);
		obj_addcandidatepage.maintabservice().click();
		obj_addcandidatepage.web_onboarding().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(obj_addcandidatepage.verifyselectcandidateview()));
		obj_addcandidatepage.selectcandidateview().click();
		obj_addcandidatepage.btncreateview().click();
		obj_addcandidatepage.txtspecifyviewname().sendKeys("HS_DEFAULT1");
		obj_addcandidatepage.chkdefaultview().click();
		List<WebElement> listcolumnleft = obj_addcandidatepage.selectcolumnlistleft();
		System.out.println(listcolumnleft.size());
		for (int i = 0; i < listcolumnleft.size(); i++) {			
			if(objarraylsit.contains(listcolumnleft.get(i).getText())) {
				listcolumnleft.get(i).click();	}
		     }
		Thread.sleep(1000);
		obj_addcandidatepage.websinglearrowrighttoleft().click();
		obj_addcandidatepage.btnsave().click();
		Thread.sleep(1000);
		for(int j=0; j<selectcolumn.length; j++) {
			if(objarraylsit.contains(obj_addcandidatepage.customertablevalue(1,j+4))){
				count++;
			} 		 
		}
		
		if(objarraylsit.size()==count) {
			logger.info("Testcase is passed successfully");
		}
				
	}
	
	 

}
