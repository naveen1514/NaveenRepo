package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.oraganehrm.Base.BaseTest;

public class HomePage extends BaseTest {

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage clickProfile()
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//i")).click();
		return this;
	}
	
	public LoginPage clickLogout()
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		return new LoginPage(driver);
	}
	
	public PIMPage clickPIM()
	{
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		return new PIMPage(driver);
	}
}
