package com.ui.PagesTests;

import org.testng.annotations.Test;

import com.oraganehrm.Base.BaseTest;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;

public class TC002_Logout extends BaseTest{
	
	@Test
	public void logout() throws InterruptedException
	{
		LoginPage lpage = new LoginPage(driver);
		lpage.addUsername().addPassword().clickLogin().clickProfile().clickLogout();
	
	}

}
