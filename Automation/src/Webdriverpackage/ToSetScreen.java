package Webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetScreen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
	Dimension dim=new Dimension(500,500);
	driver.manage().window().setSize(dim);
		
	}

}
