package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oraganehrm.Base.BaseTest;

public class LoginPage extends BaseTest {
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage addUsername() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		return this;
		}
		public LoginPage addPassword() {
		driver.findElement(By.name("password")).sendKeys("admin123");
		return this;
		}
		public HomePage clickLogin() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		return new HomePage(driver);
		}
		
		public ResetPasswordPage clickForgotPassword()
		{
			driver.findElement(By.xpath("//p[text()='Forgot your password? '] ")).click();
			return new ResetPasswordPage();
		}
		
		public void verifyLoginText()
		{
			String actual = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
			//System.out.println(actual);
			String expected="Login";
			
			Assert.assertEquals(actual, expected, "Login text is displayed");
			
		}
		
		public void verifyLogo()
		{
			WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
			logo.isDisplayed();
		}
		public void siteLink() throws InterruptedException
		{
			WebElement orglink = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
			boolean link = orglink.isDisplayed();
			System.out.println("OrangeHrm link is displayed:"+link);
			orglink.click();
			Thread.sleep(2000);
			
		}
		
		

}
