package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
	 driver.findElement(By.id("email")).sendKeys("dhiraj2abc@gmail.com");
	 Thread.sleep(20000);
	boolean enable = driver.findElement(By.xpath(" //button[contains(text(),  'Continue' )]")).isEnabled();
	 if(enable) {
		 System.out.println("pass:the button is enable");
		 
	 }
	 else
		 System.out.println("fail:the button is not enabler");
	 

	}

}
