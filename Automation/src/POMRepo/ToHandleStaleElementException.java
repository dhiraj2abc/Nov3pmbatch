package POMRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleStaleElementException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login = new LoginPage(driver);
		login.getUsernameTextField().sendKeys("admin");
		
		driver.navigate().refresh();
		
		login.getUsernameTextField().sendKeys("trainee");

	}

}
