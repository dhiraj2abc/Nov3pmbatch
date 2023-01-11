package BasicTextScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;

public class ToVerifyHomePageTest2 {
	@Test
		public void toVerifyHomePageTest() throws IOException 
		{
		FileUtility futils = new FileUtility();
		
		String url = futils.fetchDataFromPropertyFile("url");
		String username = futils.fetchDataFromPropertyFile("username");
		String password = futils.fetchDataFromPropertyFile("password");
		
		ExcelUtility eUtility = new ExcelUtility();
		String expectedTitle = eUtility.fetchStringDataFromExcelSheet("Sheet2", 1, 0);
		
		//Test script
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	   
		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitForTitle(driver,"Enter");
		
		HomePage home = new HomePage(driver);
		String actualTitle = home.verifyHomePageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("pass: The title is verified");
		
		home.logoutAction();
		
		driver.quit();
	
		}}
