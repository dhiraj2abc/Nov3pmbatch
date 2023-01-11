package Webdriverpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowIds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
        Set<String> allWinIds = driver.getWindowHandles();
        System.out.println(allWinIds);
        for(String id:allWinIds) {
	     System.out.println(id);
}

	}

}
