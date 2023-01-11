package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandalePrintPopUps {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DHIRAJ%20KUMAR%20DHAIRYA/Desktop/demoPrintpop.html");
		driver.findElement(By.xpath("//button")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		Runtime.getRuntime().exec("./autoIt/Printpop.exe");
		

	}

}
