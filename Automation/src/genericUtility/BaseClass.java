package genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMRepo.HomePage;
import POMRepo.LoginPage;

public class BaseClass {
	
public	ExcelUtility eUtility = new ExcelUtility();
public FileUtility futils = new FileUtility();
public WebDriver driver;
	@BeforeSuite
	public void bsConfig() {
		System.out.println("DataBase connection has been Established");
	}
	@BeforeClass
	public void bcConfig() throws IOException {
		
		String url = futils.fetchDataFromPropertyFile("url");

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		System.out.println("Browser has been launched");
		System.out.println("Nagivate to the url");
	}
	@BeforeMethod
	public void bmConfig() throws IOException {
		String username = futils.fetchDataFromPropertyFile("username");
		String password = futils.fetchDataFromPropertyFile("password");
		
		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);
		System.out.println("Logged in to the aaplication");
	}
	@AfterMethod
	public void amConfig() {
		HomePage home = new HomePage(driver);
		home.logoutAction();
		System.out.println("Logged of the application");
}
	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("Browser has been closed");
	}
	@AfterSuite
	public void asConfig() {
		System.out.println("database connection has been closed");
}
}
