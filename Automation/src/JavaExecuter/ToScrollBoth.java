package JavaExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollBoth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?q=iphone&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_2_na_na_na&as-pos=2&as-type=HISTORY&suggestionId=iphone%7CMobiles&requestId=0d565fe3-5da3-479f-af88-8c77f95e2464");
		driver.manage().window().setSize(new Dimension(200,500));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,500)");
		

	}

}
