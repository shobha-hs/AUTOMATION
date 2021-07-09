package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class objCandidatePage {
	
	
public WebDriver driver;
	
	public objCandidatePage(WebDriver driver)
	{
		this.driver=driver;
	}
    
	By txtemailid = By.xpath("//*[@id=\"zp_field_52945000000202396\"]");
	By webcountry = By.xpath("//*[@class=\"select2-result-label\"]");
	By txtcountryname = By.xpath("//*[@id=\"select2-drop\"]/div/input");
	By txtphonenumber = By.xpath("//*[@id=\"zp_field_52945000000202398\"]");
	By txtfirstname = By.xpath("//*[@id=\"zp_field_52945000000202392\"]");
	By txtlastname = By.xpath("//*[@id=\"zp_field_52945000000202394\"]");
	By btnsubmitaddcandidate  = By.xpath("//*[@id=\"zp_addedit_record_52945000000202346\"] //button[text()=\"Submit\"]");
	By btnclose = By.xpath("//*[@id='zp_addedit_record_52945000000202346'] //button[text()='Close']");
	By tabcandidateview = By.xpath("//*[@id='zp_views_records_table']/tbody/tr");
	By tabcandidateview2 = By.xpath("//*[@id='zp_views_records_table']/tbody/tr[1]/td");
	String tabheadercolumnbefore = "//*[@id='zp_views_records_table']/thead/tr[";
	String tabheadercolumnafter = "]/th[";
	String aftertr_XPath = "]/div/span";
	By txtofficialemailid = By.xpath("//*[@id=\"zp_field_52945000000202402\"]");
	By txtempphoto = By.xpath("//*[@id=\"zp_field_52945000000202400\"]");
	By txtstreetaddress = By.xpath("//*[@id=\"zp_field_52945000000202406\"]");
	By txtstate = By.xpath("//*[@id=\"zp_field_52945000000202410\"]");
	By txtcity = By.xpath("//*[@id=\"zp_field_52945000000202408\"]");
	By selectlistcountry = By.xpath("//*[@id=\"zp_field_52945000000202414\"]");
	By txtexperienece = By.xpath("//*[@id=\"zp_field_52945000000202416\"]");
	By txtcurrentsalary = By.xpath("//*[@id=\"zp_field_52945000000202424\"]");
	By selectsourceofhire = By.xpath("//*[@id=\"zp_field_52945000000202418\"]");
	By txtareaskillset = By.xpath("//*[@id=\"zp_field_52945000000202420\"]");
	
	public By verifycloseelement()
	{
		return btnclose;
	}
	public WebElement txtareaskillset()	{
		return driver.findElement(txtareaskillset);
	}
	public WebElement selectsourceofhire()	{
		return driver.findElement(selectsourceofhire);
	}
	public WebElement txtcurrentsalary()	{
		return driver.findElement(txtcurrentsalary);
	}
	public WebElement txtexperienece()	{
		return driver.findElement(txtexperienece);
	}
	
	public WebElement selectlistcountry()	{
		return driver.findElement(selectlistcountry);
	}
	public WebElement txtcity()	{
		return driver.findElement(txtcity);
	}
	
	public WebElement txtstate()	{
		return driver.findElement(txtstate);
	}
	
	
	public WebElement txtstreetaddress()
	{
		return driver.findElement(txtstreetaddress);
	}
	
	public WebElement txtempphoto() {
		return driver.findElement(txtempphoto);
	}
	public WebElement txtofficialemailid()
	{
		return driver.findElement(txtofficialemailid);
	}
	
	public String customertablevalue(int i, int j)
	{
		String Finalxpath=tabheadercolumnbefore+i+tabheadercolumnafter+j+aftertr_XPath;
		return driver.findElement(By.xpath(Finalxpath)).getText();
	}
		
	public int rowsizecandidateview()
	{
		List<WebElement> rowcountcandidateviewtab = driver.findElements(tabcandidateview);
		return rowcountcandidateviewtab.size();
	}
	
	public int columncandidateview()
	{
		List<WebElement> colcountcandidateviewtab = driver.findElements(tabcandidateview2);
		return colcountcandidateviewtab.size();
	}
	

	public By verifytxtemailid()
	{
		return txtemailid;
	}
	
	public WebElement txtemailid()
	{
		return driver.findElement(txtemailid);
	}
	
	public WebElement webcountry()
	{
		return driver.findElement(webcountry);
	}
	
	public WebElement txtcountryname()
	{
		return driver.findElement(txtcountryname);
	}
	
	public WebElement txtphonenumber()
	{
		return driver.findElement(txtphonenumber);
	}
	
	public WebElement txtfirstname()
	{
		return driver.findElement(txtfirstname);
	}
	
	public WebElement txtlastname()
	{
		return driver.findElement(txtlastname);
	}
	
	public WebElement btnsubmitaddcandidate()
	{
		return driver.findElement(btnsubmitaddcandidate);
	}
	
	public WebElement btnclose()
	{
		return driver.findElement(btnclose);
	}

	By maintabservice = By.xpath("//*[@id=\"zp_maintab_services\"]");
	By web_onboarding = By.xpath("//*[@tab=\"Onboarding\"]");
	By selectcandidateview = By.xpath("//*[@id=\"s2id_zp_select_viewlist\"]");
	By btncreateview = By.xpath("//*[@id=\"select2-drop\"]/button");
	By verify_createview = By.xpath("//*[@id=\"zp_createview\"]");
	By txtspecifyviewname = By.xpath("//*[@id=\"zp_createview\"]/div/div/div[2]/div/form/div/div/input");
	By chkdefaultview = By.xpath("//*[@id=\"zp_custom_view_default\"]");
	By selectcolumnlistright = By.xpath("//*[@id=\"zp_custom_view_right_columns\"]/li/div/span");
	By selectcolumnlistleft = By.xpath("//*[@id=\"zp_custom_view_left_columns\"]/li/div/span");
	By websinglearrowrighttoleft = By.xpath("//*[@id=\"zp_createview\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]");
	By btnsave = By.xpath("//*[@id=\"zp_createview\"]/div[1]/div[1]/div[3]/button[@id=\"zp_modal_blubtn\"]");
	
	public By  verifyselectcandidateview()
	{
		return selectcandidateview;
	}
	
	public WebElement maintabservice()
	{
		return driver.findElement(maintabservice);
	}
	
	public WebElement web_onboarding()
	{
		return driver.findElement(web_onboarding);
	}
	
	public WebElement selectcandidateview()
	{
		return driver.findElement(selectcandidateview);
	}
	
	public WebElement btncreateview()
	{
		return driver.findElement(btncreateview);
	}
	
	public By verify_createview()
	{
		return verify_createview;
	}
	
	public WebElement txtspecifyviewname()
	{
		return driver.findElement(txtspecifyviewname);
	}
	
	public WebElement chkdefaultview()
	{
		return driver.findElement(chkdefaultview);
	}
	
	public List<WebElement> selectcolumnlistright()
	{
		return driver.findElements(selectcolumnlistright);
	}
	
	public List<WebElement> selectcolumnlistleft()
	{
		return driver.findElements(selectcolumnlistleft);
	}
	
	public WebElement websinglearrowrighttoleft()
	{
		return driver.findElement(websinglearrowrighttoleft);
	}
	
	public WebElement btnsave()
	{
		return driver.findElement(btnsave);
	}
}
