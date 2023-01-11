package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToModifyPolingPeroid {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		driver.findElement(By.id("email")).sendKeys("dhiraj2abc@gmail.com");
	WebElement button = driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]"));
	
	FluentWait wait = new FluentWait(driver);
	wait.pollingEvery(100, TimeUnit.MILLISECONDS);
	wait.until(ExpectedConditions.elementToBeClickable(button));
	button.click();


	}

}
