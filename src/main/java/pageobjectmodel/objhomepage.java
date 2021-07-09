package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class objhomepage {

	public WebDriver driver;

	public objhomepage(WebDriver driver) {
		this.driver = driver;
	}

	By verifyloginsuccess_checkin = By.xpath("//*[@id=\"ZPD_Top_Att_Stat\"]");
	By dashboardtittle = By.xpath("//*[@class=\"dash-title\"]");
	By customizewidgets = By.xpath("//*[@id=\"zp_d_cdash\"]");
	By billable_nonbillable = By.xpath("//*[@id=\"zp_d_cw\"]/ul/li[14]/label/span");
	By customizedwidgets = By.xpath("//*[@class='ui-sortable']/li/span");
	By widgetclose = By.xpath("//*[@class=\"close closeicon\"]");
	By webbirthday = By.xpath("//*[@cus_name='BIRTHDAY']");
	By lnkquickadd = By.xpath("//*[@id=\"zp_quickadd_form_outer\"]");
	By lnkonboarding = By.xpath("//*[text()=\"Onboarding\"]");
	By lnkcandidate = By.xpath("//*[text()=\"Candidate\"]");
	By webaddcandidate = By.xpath("//*[@id=\"zp_form_headerdisp\"]");
	By tittle = By.xpath("//*[@class=\"dash-title\"]");
	By btnapplyleave = By.xpath("//*[@id=\"apply_leave\"]");
	By selempid = By.xpath("//*[@id=\"s2id_zp_field_52945000000036103\"]");
	By datefrom = By.xpath("//*[@id=\"zp_field_52945000000036109\"]");
	By dateto = By.xpath("//*[@id=\"zp_field_52945000000036111\"]");
	By txtempidApplyleave = By.xpath("//*[@id=\"select2-drop\"]/div/input");
	By leaveselect = By.xpath("//*[@id=\"s2id_zp_field_52945000000036105\"]");
	By leavetypetxt = By.xpath("//*[@id=\"select2-drop\"]/div/input");
	String calfromdate_bftr = "//*[@id=\"calbody\"]/tr[";
	String calfromdate_aftr = "]/td[";
	String calfromdate_aftd = "]";
	String withspan = "/div/span";
	By clkdivelement = By.xpath("//*[@id=\"home-dashboard\"]");

	public WebElement clkdivelement() {
		return driver.findElement(clkdivelement);
	}

	public WebElement calendardateretrun(String dateval) {
		WebElement element = null;
		List<WebElement> rowcount = driver.findElements(By.xpath("//*[@id=\"calbody\"]/tr"));
		List<WebElement> columncount = driver.findElements(By.xpath("//*[@id=\"calbody\"]/tr[1]/td"));
		for (int i = 1; i <= rowcount.size(); i++) {
			for (int j = 1; j <= columncount.size(); j++) {

				String strvalue = driver
						.findElement(By.xpath(calfromdate_bftr + i + calfromdate_aftr + j + calfromdate_aftd))
						.getAttribute("class");
				if (!(strvalue.equalsIgnoreCase("day empty")) && !(strvalue.equalsIgnoreCase("name"))) {
					String strdatevalue = driver
							.findElement(
									By.xpath(calfromdate_bftr + i + calfromdate_aftr + j + calfromdate_aftd + withspan))
							.getText();
					if (strdatevalue.equalsIgnoreCase(dateval)) {
						element = driver.findElement(
								By.xpath(calfromdate_bftr + i + calfromdate_aftr + j + calfromdate_aftd + withspan));
						break;
					}

				}

			}

		}

		return element;
	}

	public void calendergenericfunction(String date) {
		By arrow;
		
		String[] datelist1 = date.split("-");
		String datevalue=datelist1[0]; String monthvalue=datelist1[1]; String year=datelist1[2];
	
		if (!driver.findElement(By.xpath("//*[@id='calmonth']")).getText().contains(year)) {
			driver.findElement(By.xpath("//*[@id='calmonth']")).click();
			int yeartxt = Integer.parseInt(driver.findElement(By.xpath("//*[@id='calmonth']")).getText());
			if (yeartxt > Integer.parseInt(year)) {
			  arrow = By.xpath("//*[@id=\"header\"] //div[@class='IC-ar-lft gry S16 CP FL ML5']");
			} else {
			  arrow = By.xpath("//*[@id='header'] //div[@class='IC-ar-rgt gry S16 CP FR MR5']");
			}
			while (!driver.findElement(By.xpath("//*[@id='calmonth']")).getText().contains(year)) {
				driver.findElement(arrow).click();
			}
			
		}

		List<WebElement> monthlist = driver.findElements(By.xpath("//*[@id='moncalbody'] //span"));
		for (int i = 1; i <= monthlist.size(); i++) {
			String strmonth = driver.findElements(By.xpath("//*[@id='moncalbody'] //span")).get(i).getText();
			if (strmonth.equalsIgnoreCase(monthvalue)) {
				driver.findElements(By.xpath("//*[@id='moncalbody'] //span")).get(i).click();
				break;
			}
		}

		List<WebElement> datelist = driver.findElements(By.xpath("//*[@class=\"num\"]"));
		for (int i = 1; i <= datelist.size(); i++) {
			String strdate = driver.findElements(By.xpath("//*[@class='num']")).get(i).getText();
			if (strdate.equalsIgnoreCase(datevalue)) {
				driver.findElements(By.xpath("//*[@class='num']")).get(i).click();
				break;
			}
		}
	}

	public WebElement leavetypetxt() {
		return driver.findElement(leavetypetxt);
	}

	public WebElement leaveselect() {
		return driver.findElement(leaveselect);
	}

	public WebElement txtempidApplyleave() {
		return driver.findElement(txtempidApplyleave);
	}

	public WebElement selempid() {
		return driver.findElement(selempid);
	}

	public WebElement datefrom() {
		return driver.findElement(datefrom);
	}

	public WebElement dateto() {
		return driver.findElement(dateto);

	}

	public WebElement btnapplyleave() {
		return driver.findElement(btnapplyleave);
	}

	public List<WebElement> tittleread() {
		return driver.findElements(tittle);
	}

	public WebElement tittlename() {
		return driver.findElement(tittle);
	}
	
	
	public String clkwebelementincustomize_before = "//*[@class=\"ui-sortable\"]/li[";
	public String clkwebelementincustomize_after = "]/label/span";
	public String checkedtype = "]/label/input";
	public String webelementname12 = "]/span";
	
	
	public WebElement webelementname(int i) {
		String finalxpath = clkwebelementincustomize_before + i + webelementname12;
		return driver.findElement(By.xpath(finalxpath));
	}

	public WebElement verifycuswidgetischecked(int i) {
		String finalexpath = clkwebelementincustomize_before + i + checkedtype;
		return driver.findElement(By.xpath(finalexpath));
	}
    		
	public List<WebElement> verifycuswidgetischecked12()
	{
		By finalxpath = By.xpath("//*[@class='ui-sortable']/li/label/input");
		return driver.findElements(finalxpath);
	}
	
	public WebElement clkspanelement(int i) {
		String finalxpath = clkwebelementincustomize_before + i + clkwebelementincustomize_after;
		return driver.findElement(By.xpath(finalxpath));
	}
	
	public List<WebElement> clkspanelement12() {
	 By finalxpath = By.xpath("//*[@class='ui-sortable']/li/label/span");
	 return driver.findElements(finalxpath);
	}

	public List<WebElement> customizedwidgets() {
		return driver.findElements(customizedwidgets);
	}

	public WebElement lnkquickadd() {
		return driver.findElement(lnkquickadd);
	}

	public WebElement lnkonboarding() {
		return driver.findElement(lnkonboarding);
	}

	public WebElement lnkcandidate() {
		return driver.findElement(lnkcandidate);
	}

	public By webaddcandidate() {
		return webaddcandidate;
	}

	public By verifyloginsuccess_checkin() {
		return verifyloginsuccess_checkin;
	}

	public WebElement customizewidgets() {
		return driver.findElement(customizewidgets);
	}

	public WebElement billable_nonbillable() {
		return driver.findElement(billable_nonbillable);
	}

	public WebElement widgetclose() {
		return driver.findElement(widgetclose);
	}

	public WebElement webbirthday() {
		return driver.findElement(webbirthday);
	}

	public List<WebElement> dashboardtittle() {
		return driver.findElements(dashboardtittle);
	}
}
