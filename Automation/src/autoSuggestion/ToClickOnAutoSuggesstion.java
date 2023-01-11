package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAutoSuggesstion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("elon");
		Thread.sleep(3000);
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//span[contains(text(),'lon')]"));
		
		for(WebElement suggestion:autoSuggestion) {
			if(suggestion.getText().equals("elon musk son name")) {
				suggestion.click();
				break;
			}
		}
		

	}

}
