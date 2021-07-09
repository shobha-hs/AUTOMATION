package bestbuy.oma;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.objhomepage;
import resource.BaseUtil;

public class homepage extends BaseUtil {

	private static final Logger logger = LogManager.getLogger(CandidatePage.class.getName());
	public WebDriver driver;

	@Test()
	public void customwidgettc() throws InterruptedException, IOException {

		int count = 0;
		driver = initializedriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhomepage objhomeoagepeople = new objhomepage(driver);
		String listwidgettoselect = propobj.getProperty("customizewidgetlist");
		String[] strsplit = listwidgettoselect.split(",");
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(strsplit);
		System.out.println(al.size());
		wait.until(ExpectedConditions.visibilityOfElementLocated(objhomeoagepeople.verifyloginsuccess_checkin()));
		objhomeoagepeople.customizewidgets().click();
		Thread.sleep(20);
		List<WebElement> objcustomizedelement = objhomeoagepeople.customizedwidgets();
		for (int i = 0; i < objcustomizedelement.size(); i++) {
			Boolean val = al.contains(objhomeoagepeople.customizedwidgets().get(i).getText());
			Thread.sleep(300);
			boolean val2 =Boolean.parseBoolean( objhomeoagepeople.verifycuswidgetischecked12().get(i).getAttribute("checked"));
			if (( val== true) && (val2!=true)){
				objhomeoagepeople.clkspanelement12().get(i).click();
			}
		}
		Thread.sleep(10);
		objhomeoagepeople.clkdivelement().click();
		objhomeoagepeople.widgetclose().click();
		List<WebElement> texttittle = objhomeoagepeople.tittleread();
		
		for (int j = 0; j < texttittle.size(); j++) {
			if (al.contains(objhomeoagepeople.tittlename().getText()) == true) {
				count++;
			}
		}
		
		Assert.assertEquals(count, al.size());
		logger.info("pass");

		
	}

	@Test()
	public void hoempageapplyleav() throws IOException, InterruptedException {
		driver = initializedriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhomepage objhomeoagepeople = new objhomepage(driver);
		objhomeoagepeople.btnapplyleave().click();
		objhomeoagepeople.selempid().click();
		objhomeoagepeople.txtempidApplyleave().sendKeys("George Dwell S6".trim());
		objhomeoagepeople.txtempidApplyleave().sendKeys(Keys.ENTER);
		objhomeoagepeople.leaveselect().click();
		objhomeoagepeople.leavetypetxt().sendKeys("Casual Leave");
		Thread.sleep(10);
		objhomeoagepeople.leavetypetxt().sendKeys(Keys.ENTER);
		objhomeoagepeople.datefrom().click();		
		Date date = new Date();
		WebElement dateele = objhomeoagepeople.calendardateretrun(Integer.toString(date.getDate()));
		dateele.click();		
		objhomeoagepeople.dateto().click();
		WebElement datetoenter = objhomeoagepeople.calendardateretrun(Integer.toString(date.getDate()+4));
		datetoenter.click();		
		Thread.sleep(10);
		driver.findElement(By.xpath("//*[@id=\"zp_field_52945000000036117\"]")).sendKeys("shobhashivarudraiah@gmail.com");
		driver.findElement(By.xpath("//*[@name=\"Reasonforleave\"]")).sendKeys("personal emergency ");
		Thread.sleep(10);
		driver.findElement(By.xpath("//*[@id=\"zp_addedit_record_52945000000035693\"]/div/div/div[3]/button[2]")).click(); 
		List<WebElement> ele12=driver.findElements(By.xpath("//*[@id=\"top_message_outer\"]/div[1]"));
	    Assert.assertNotNull(ele12.size());
	    logger.info("pass");
	    
		}
	@Test ()
	public void addproject_cerification() throws IOException, InterruptedException 
	{
		driver = initializedriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@data-original-title=\"Log Time\"]")).click();
		Thread.sleep(100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"zp_addedit_record_52945000000064669\"]/div[1]/div/div/div[2]")));
		driver.findElement(By.xpath("//*[@fcid=\"52945000000086001\" and @class=\"IC-add-form\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Project Configuration Details\"]")));
		driver.findElement(By.xpath("//*[@id=\"zp_field_52945000000064285\"]")).sendKeys("KP_TESTING");
		driver.findElement(By.xpath("//*[@id=\"zp_quickadd_record_52945000000064269\"]/child::div/child::div/child::div[3]/button[2]")).click();		
		List<WebElement> ele=driver.findElements(By.xpath("//*[@id=\"top_message_outer\"]/div[1]"));
	    System.out.println(ele.size());
	    driver.findElement(By.xpath("//*[@fcid=\"52945000000064685\" and @class=\"IC-add-form\"]")).click();
	    driver.findElement(By.xpath("//input[@name=\"Job_Name\"]")).sendKeys("TestEngineers");
	    driver.findElement(By.xpath("//*[@id=\"zp_quickadd_record_52945000000064369\"]/div/div/div[3]/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"zp_field_52945000000064689\"]")).sendKeys("20-Jun-2021");
	    driver.findElement(By.xpath("//input[@id=\"zp_field_52945000000064697\"]")).sendKeys("F:\\shobha.png");
	    driver.findElement(By.xpath("//*[@id=\"zp_addedit_record_52945000000064669\"]/div/div/div[3]/button[2]")).click();	    
		List<WebElement> ele12=driver.findElements(By.xpath("//*[@id=\"top_message_outer\"]/div[1]"));
	    System.out.println(ele12.size());
	    Assert.assertNotNull(ele12.size());
	    logger.info("pass");
	    	
	}
	
	@Test()
	public void Testingelement() throws IOException, InterruptedException
	{
		driver = initializedriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhomepage objhomepage = new objhomepage(driver);
		/*objhomeoagepeople.customizewidgets().click();
		Thread.sleep(20);
		boolean val = driver.findElement(By.xpath("//*[@id=\"zp_d_cw\"]/ul/li[1]/label/input")).isSelected();
		objhomeoagepeople.widgetclose().click();
		//driver.findElement(By.xpath("//*[@id=\"zp_d_cw\"]/ul/li[1]/label/input")).click();*/
	//	objhomepage.calendergenericfunction("24-Nov-2009");
		List<WebElement> ele123 = driver.findElements(By.xpath("//*[@id='zp_views_records_table']/tbody/tr/td"));
		for(int i=0; i<ele123.size(); i++) {
			String strname = driver.findElements(By.xpath("//*[@id='zp_views_records_table']/tbody/tr/td")).get(i).getText();
			if(strname.equalsIgnoreCase("Mathew"))
			{  
				System.out.println(strname);
				break;
					
			}
		}
		
	}
	

	
}
