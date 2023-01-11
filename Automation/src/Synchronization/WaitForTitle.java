package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String loginPageTitle = driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("trainee");
		
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		
		
		
		String homePagetitle = driver.getTitle();
		System.out.println("title before login: "+loginPageTitle);
		System.out.println("title after login: "+homePagetitle);

	}

}
