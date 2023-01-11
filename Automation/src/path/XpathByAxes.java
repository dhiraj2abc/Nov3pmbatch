package path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=i+phone+11&otracker=AS_Query_HistoryAutoSuggest_2_0&otracker1=AS_Query_HistoryAutoSuggest_2_0&marketplace=FLIPKART&as-show=off&as=off&as-pos=2&as-type=HISTORY");
		 WebElement price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹40,999']"));
			String actualprice = price.getText();
			System.out.println(actualprice);


	}

}
