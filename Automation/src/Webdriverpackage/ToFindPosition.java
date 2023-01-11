package Webdriverpackage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindPosition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		Point position=driver.manage().window().getPosition();
		System.out.println(position);
		
		int startX=position.getX();
		int startY=position.getY();
		System.out.println(startX);
		System.out.println(startY);
	}

}
