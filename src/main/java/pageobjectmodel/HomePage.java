package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By lnksignupnow = By.xpath("//*[@class='zp-main-apps zp-main-people zapp-show']/a/em");
	By zohologo = By.xpath("//*[@class='zoho-logo']");
	By lnksignin = By.xpath("//*[text()='Sign in']");

	public WebElement zohologo() {
		
		return driver.findElement(zohologo);
	}

	public WebElement lnksignin() {
		
		return driver.findElement(lnksignin);

	}
	
	

}
