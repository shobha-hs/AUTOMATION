package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class objamzonpage {
	
	public WebDriver driver;

	public objamzonpage(WebDriver driver) {
		this.driver = driver;
	}
	
	By txtHomePageSearchBox = By.xpath("//*[@id='twotabsearchtextbox']");
	By btnHomePageSigin = By.xpath("//*[@id='nav-link-accountList']");
	By txtEmailMobilePhoneNumber = By.xpath("//*[@id='ap_email']");
	By btnSiginContinue = By.xpath("//input[@id='continue']");
	By txtPassword = By.xpath("//input[@id='ap_password']");
	By btnSignIn = By.xpath("//input[@id='signInSubmit']");
	By userDisplayNameHomePage = By.xpath("//*[@id='glow-ingress-line1']");
	
	public WebElement txtHomePageSearchBox()	{
		return driver.findElement(txtHomePageSearchBox);
	}
	
	public WebElement btnHomePageSigin() {
		return driver.findElement(btnHomePageSigin);
	}
	
	public WebElement txtEmailMobilePhoneNumber(){
		return driver.findElement(txtEmailMobilePhoneNumber);
	}
	
	public WebElement btnSiginContinue() {
		return driver.findElement(btnSiginContinue);
	}
	
	public WebElement txtPassword() {
		return driver.findElement(txtPassword);
	}
	
	public WebElement btnSignIn() {
		return driver.findElement(btnSignIn);
	}
	
	public WebElement userDisplayNameHomePage() {
		return driver.findElement(userDisplayNameHomePage);
	}
	
	

}
