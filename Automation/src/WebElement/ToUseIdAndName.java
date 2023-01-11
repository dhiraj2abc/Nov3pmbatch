package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdAndName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DHIRAJ%20KUMAR%20DHAIRYA/Desktop/demo.html");
		WebElement username=driver.findElement(By.id("123"));
		username.sendKeys("class khatam");
		WebElement username1=driver.findElement(By.id("345"));
		username1.sendKeys("one week ke liye khatam");
		
		

	}

}
