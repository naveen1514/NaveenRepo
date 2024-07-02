package com.oraganehrm.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public  WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
@AfterMethod
	public void closeWindow() {
		driver.quit();
	}
	    


}
