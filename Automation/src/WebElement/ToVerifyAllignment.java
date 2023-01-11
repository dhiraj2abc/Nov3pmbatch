package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DHIRAJ%20KUMAR%20DHAIRYA/Desktop/demo.html");
		 Point usernameLoc = driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameLoc);
		
		int usernameStartx=usernameLoc.getX();
	
		
		 Point passwordLoc = driver.findElement(By.id("345")).getLocation();
       int passwordStartx = passwordLoc.getX();
		System.out.println("the start x of username is "+usernameStartx);
		System.out.println("the start x of username is "+passwordStartx);
		if(usernameStartx==passwordStartx) {
			System.out.println("pass:the allignment is verifyed");
		}
		else
			System.out.println("fail:allignment is not verified");
	}

}
