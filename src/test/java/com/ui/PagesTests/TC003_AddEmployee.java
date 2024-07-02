package com.ui.PagesTests;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oraganehrm.Base.BaseTest;
import com.orghrm.utils.TestUtil;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.ui.pages.PIMPage;


public class TC003_AddEmployee extends BaseTest{
	
	@Test(dataProvider = "addEmployee")
	
	public void addEmployee(String FirstName, String LastName) throws InterruptedException
	{
		LoginPage lpage = new LoginPage(driver);	
		lpage.addUsername().addPassword().clickLogin().clickPIM().addEmployee(FirstName,LastName);
		
	}
	@DataProvider(name = "addEmployee")
	public Object[][] getUsersData()
	{
		Object[][] data = TestUtil.getTestData("Sheet1");	
		 return data;
		}
		
		
	}


