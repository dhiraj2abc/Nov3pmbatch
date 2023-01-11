package Webdriverpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/");
Navigation nav = driver.navigate();
nav.to("https://www.facebook.com/");
nav.back();
nav.forward()
;
nav.refresh();
 
 
 
}

 
	
	
	

	}


