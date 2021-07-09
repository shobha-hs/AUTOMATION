package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseUtil {

	public WebDriver driver;
	public static WebDriver screenshotdriver;
	String basepath = System.getProperty("user.dir");	
	public Properties propobj;
	public WebDriverWait wait;
	public ExtentSparkReporter report = null;
	public ExtentReports  extent = null;
	
	
	@Test()
	public WebDriver initializedriver() throws IOException {

		propobj = new Properties();
		FileInputStream objfile = new FileInputStream(
				basepath + "\\src\\main\\java\\resource\\Configuration.properties");
		propobj.load(objfile);
		String strbrowser = propobj.getProperty("browser");
		String strUrl = propobj.getProperty("url");
		if (strbrowser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", basepath + "\\dependency\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setProxy(null);
			// options.setExperimentalOption("debuggerAddress", "localhost:9988");
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
			// driver = new ChromeDriver();

		} else if (strbrowser.equalsIgnoreCase("mozilla")) {

			System.setProperty("webdriver.gecko.driver", basepath + "\\dependency\\geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
			driver.manage().deleteAllCookies();

		} else if (strbrowser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", basepath + "\\dependency\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
		}
		driver.manage().window().maximize();
		driver.get(strUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		screenshotdriver = driver;
		return driver;
        
	}
  
	
	public String screenShotCapture(String testcaseName) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot) screenshotdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String fileWithPath = "E:\\omaautomation\\TestGITNEWREPO\\Reports\\"+testcaseName+".png";
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
		return fileWithPath;
		
	}
	
	public ExtentReports  getReportObject()	{
		
		String path = System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("OMA AUTOMATION TESTING");
		report.config().setDocumentTitle("AUTOMATION RESULT");
		report.config().setTimeStampFormat("dd//MM//yyyy");
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Shobha");
		return extent ;
		
		
	}
	

}
