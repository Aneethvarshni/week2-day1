package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ATP SOLUTIONS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aneethvarshni");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ponmudi");
		WebElement srcDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(srcDropDown);
		//select.selectByVisibleText("Other");
		//select.selectByIndex(4);
		select.selectByValue("LEAD_DIRECTMAIL");
		WebElement marketingDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1 = new Select(marketingDropDown);
		select1.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Pons");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Salutation");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/20/90");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title Name");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1200000");
		WebElement currencyDropDown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select select2 = new Select(currencyDropDown);
		select2.selectByValue("INR");
		WebElement industryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select3 = new Select(industryDropDown);
		select3.selectByVisibleText("Computer Software");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		WebElement ownershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select4 = new Select(ownershipDropDown);
		select4.selectByVisibleText("S-Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("012003");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$$");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating a lead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Lead must be approved");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Primary");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.atpsolutions.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Babu");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Mouli");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("no 518 d3 road");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Sholinganallur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement cntryDropDown = driver.findElement(By.name("generalCountryGeoId"));
		Select select5 = new Select(cntryDropDown);
		select5.selectByVisibleText("India");
		WebElement stateDropDown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select6 = new Select(stateDropDown);
		stateDropDown.sendKeys(Keys.ARROW_DOWN);
		select6.selectByVisibleText("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600119");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("IN");
		String text1 = driver.findElement(By.id("createLeadForm_firstName")).getText();
		System.out.println(text1);
		driver.findElement(By.className("smallSubmit")).click();
		String titleName = driver.getTitle();
		String title2 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(titleName);
		System.out.println(title2);
		if(titleName.contains(title2))
		{
		System.out.println(titleName);
		} else
		{
			System.out.println("Title name is not view lead");
		}
		driver.close();

	}

}
