package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySelected {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DHIRAJ%20KUMAR%20DHAIRYA/Desktop/demo.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		boolean selected = checkbox.isSelected();
		if(selected) {
			System.out.println("pass: the checkbox is selecterd");
			
			
		}
		else
			System.out.println("fail: the checkbo is not selected");

	}

}
