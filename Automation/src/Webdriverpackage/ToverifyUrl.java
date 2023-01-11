package Webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ToverifyUrl {

	public static void main(String[] args) {
		String expectedURL="facebook";
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String actualURL=driver.getCurrentUrl();
	System.out.println("Actual url is : "+actualURL);
	System.out.println("Expected URL is "+expectedURL);
	if(actualURL.contains(expectedURL)) {
		System.out.println("pass the validation");
		
		
	}
	else {
		System.out.println("fail the validation");
	}
	

	}

}
