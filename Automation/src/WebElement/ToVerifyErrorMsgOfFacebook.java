package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsgOfFacebook {

	public static void main(String[] args) {
		String expectedErrorMsg="The email address or mobile number ";																																																										
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		String actualErrorMsg = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(actualErrorMsg);
		if(actualErrorMsg.contains(expectedErrorMsg)) {
			System.out.println("pass:the error msg has been verifird");
			
		}
		else
			System.out.println("fail:the error msg has not be verified");

	}

}
