package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandaleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("elon");
		Thread.sleep(3000);
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//span[contains(text(),'lon')]"));
		System.out.println(autoSuggestion);
		int noOfAutoSuggetion = autoSuggestion.size();
		System.out.println("number of AutoSuggetion :"+noOfAutoSuggetion);
		for(WebElement suggestion:autoSuggestion) {
			System.out.println(suggestion.getText());
		}

	}

}
