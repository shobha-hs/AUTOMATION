package bestbuy.oma;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class screenshot {

	public WebDriver driver;
	String basepath = System.getProperty("user.dir");
	public static void main(String[] args) throws IOException {
	
		screenshot objscreenshot = new screenshot();
		objscreenshot.testcasename();
		
		

	}
	
	public void testcasename() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", basepath + "\\dependency\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.setProxy(null);
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String fileWithPath = "E:\\omaautomation\\TestGITNEWREPO\\Reports\\testname.png";
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
