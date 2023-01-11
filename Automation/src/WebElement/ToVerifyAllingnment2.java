package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllingnment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DHIRAJ%20KUMAR%20DHAIRYA/Desktop/demo.html");
		 Point usernameLoc = driver.findElement(By.id("123")).getLocation();
		System.out.println(usernameLoc);
		
		int usernameStarty=usernameLoc.getY();
	
		
		 Point passwordLoc = driver.findElement(By.id("345")).getLocation();
       int passwordStarty= passwordLoc.getY();
		System.out.println("the start y of username is "+usernameStarty);
		System.out.println("the start y of username is "+passwordStarty);
		if(usernameStarty==passwordStarty) {
			System.out.println("pass:allignment is verifyed");
		}
		else
			System.out.println("fail:allignment is not verifyed");
	}

}

	
