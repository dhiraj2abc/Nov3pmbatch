package BasicTextScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;

public class ToVerifyHomePageTest {


	public static void main(String[] args) throws IOException {
		
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
		
		if(actualTitle.equals(actualTitle)) {
			System.out.println("pass: The title is verifyed");
			
		}
		else {
			System.out.println("fail:the title is not verifyed");
		}
		home.logoutAction();
		
		driver.quit();
			
			
			
			
		}
		
	}


