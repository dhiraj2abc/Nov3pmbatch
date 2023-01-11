package Webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Toclose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	String pageSource=driver.getPageSource();  
	
    System.out.println(pageSource);
    
    Thread.sleep(5000);
		driver.close();
		
		
	}

}
