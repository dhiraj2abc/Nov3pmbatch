package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		String expectedAltText="Flipkart";
		String expectedToolTipText="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String actualAltText = driver.findElement(By.xpath("//img[@class='_2xm1JU']")).getAttribute("alt");
		System.out.println(actualAltText);
		
		if(actualAltText.equals(expectedAltText)) {
			System.out.println("passs:Alt text is verified");
		}
		else
			System.out.println("fail:Alt text is not verified");

	}

}
