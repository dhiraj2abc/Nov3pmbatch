package path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVarifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMessage = "Username or Password is invalid. Please try again.";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
		Thread.sleep(2000);
		
	String actualErrorMessage = driver.findElement(By.className("errormsg")).getText();
		
		if (actualErrorMessage.equals(expectedErrorMessage))
		{
			System.out.println("pass: The error msg is varified");
		}
		else
			System.out.println("Fail: The errorc msg ios not varified");
		driver.quit();
		
	}

}
