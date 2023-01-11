package BasicTextScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;

public class ToVerifyHomePageTest3 extends BaseClass {
	@Test
	public void toVerifyHomePageTest() throws EncryptedDocumentException, IOException 
	{
		
	
	//ExcelUtility eUtility = new ExcelUtility();
	String expectedTitle = eUtility.fetchStringDataFromExcelSheet("Sheet2", 1, 0);
	HomePage home = new HomePage(driver);
	
	WebDriverUtility wUtils = new WebDriverUtility();
	wUtils.toWaitForTitle(driver,"Enter");
	
	String actualTitle = home.verifyHomePageTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println("pass: The title is verified");
	
	
	
	

	}}



