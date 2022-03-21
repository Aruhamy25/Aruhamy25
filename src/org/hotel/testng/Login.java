package org.hotel.testng;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	static WebDriver driver;
	@BeforeClass
	private void config() {
		browserConFig();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
	}

	@AfterClass
	public void end() {
//		quitWindow();
	}
	
	
	@Parameters({"username","password"})
	@Test(priority=1)
	private void login(String user,String pass) {
	
		WebElement txtUsername = locateById("username");
		sendKeys(txtUsername, user);
		
		WebElement txtPassword = locateById("password");
		sendKeys(txtPassword, pass);
		
		WebElement btnLogin = locateById("login");
		click(btnLogin);
}	
}
