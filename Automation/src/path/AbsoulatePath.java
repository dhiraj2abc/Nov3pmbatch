package path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoulatePath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DHIRAJ%20KUMAR%20DHAIRYA/Desktop/xpath.html");
		driver.findElement(By.xpath("html/body/div[2]/input[2]|html/body/div[1]/input[2]")).sendKeys("akash");
		driver.findElement(By.xpath("html/body/div[2]/input[1]")).sendKeys("dhiraj");
	

	}

}
