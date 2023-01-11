package ToSwitchToFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSwitchToDefaultContent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.id("draggable")),50,50).perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("API documentation")).click();
		

	}

}
