package Webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOGetSize {
	public static void main(String[] args) {
		
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Dimension dim=driver.manage().window().getSize();
		System.out.println(dim);
		int width=dim.getWidth();
		int hight=dim.getHeight();
		
		System.out.println("the width is "+width);
		System.out.println("the hight is "+hight);

	}

}
