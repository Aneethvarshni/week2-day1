package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUsingfirefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps");
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
		WebElement eleDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(eleDropDown);
		select.selectByVisibleText("Other");
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(text);
		String titleName = driver.getTitle();
		System.out.println(titleName);

	}

}
