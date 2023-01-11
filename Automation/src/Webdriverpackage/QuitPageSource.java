package Webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitPageSource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(30000);
		driver.quit();
		
		

	}

}
