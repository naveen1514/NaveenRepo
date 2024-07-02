package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oraganehrm.Base.BaseTest;
import com.orghrm.utils.TestUtil;

public class PIMPage extends BaseTest {
	
	public PIMPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	/*
	 * @DataProvider(name = "addEmployee") public Object[][] getUsersData() {
	 * Object[][] data = TestUtil.getTestData("Sheet1"); return data; }
	 */
	
	
	//@DataProvider(name="addEmployee")
	public PIMPage addEmployee(String FirstName, String LastName) throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.name("firstName")).sendKeys(FirstName);
		driver.findElement(By.name("lastName")).sendKeys(LastName);
		//driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"))
		//.sendKeys(EmployeeId);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	
	
}
