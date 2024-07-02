package com.ui.PagesTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.oraganehrm.Base.BaseTest;
import com.ui.pages.LoginPage;

public class TC001_Login extends BaseTest{

	LoginPage lpage;
	@BeforeMethod
	public void init()
	{
		lpage = new LoginPage(driver);
	}
	@Test
	public void login() throws InterruptedException
	{
		//LoginPage lpage = new LoginPage(driver);	
		lpage.addUsername().addPassword().clickLogin();
	}
	@Test
	public void verifyResetPass()
	{
		//LoginPage lpage = new LoginPage(driver);
		lpage.clickForgotPassword();
	}
	@Test
	public void verifyLoginText()
	{
		//LoginPage lpage = new LoginPage(driver);
		lpage.verifyLoginText();
	}
	
	@Test
	public void verifyLogo()
	{
		LoginPage lpage = new LoginPage(driver);
		lpage.verifyLogo();
		
	}
	@Test
	public void siteLink() throws InterruptedException
	{
		LoginPage lpage = new LoginPage(driver);
		lpage.siteLink();
	}
}
