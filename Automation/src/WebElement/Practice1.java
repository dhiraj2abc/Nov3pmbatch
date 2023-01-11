package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=i+phone+11&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off&as-pos=1&as-type=HISTORY");
		driver.findElement(By.xpath("");
	}

}
