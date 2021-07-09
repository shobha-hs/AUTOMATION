package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignPage {
	
public WebDriver driver;
	
	public SignPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txtloginname = By.xpath("//*[@id='login_id']");
	By btnnext = By.xpath("//*[@id='nextbtn' and @class='btn blue']");
	By txtpwd = By.xpath("//*[@id='password']");
	By lnkpeopleselection = By.xpath("//div[text()=\"People\"]");
	
	public WebElement txtloginname()
	{
		return driver.findElement(txtloginname);
	}
	
	public WebElement btnnext()
	{
		return driver.findElement(btnnext);
	}

	public WebElement txtpwd()
	{
		return driver.findElement(txtpwd);
	}
	
	public WebElement lnkpeopleselection()
	{
		return driver.findElement(lnkpeopleselection);
	}
	
}
