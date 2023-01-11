package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandaleHidenDivesionPopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		//or we can use action class to come out this login pop up by clicking outside the box
		Actions action = new Actions(driver);
		action.moveByOffset(1300,0);

	}

}
