package ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToActiveElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement ae = driver.switchTo().activeElement();
		ae.sendKeys("musician");

	}

}
