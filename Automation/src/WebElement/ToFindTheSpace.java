package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindTheSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DHIRAJ%20KUMAR%20DHAIRYA/Desktop/demo.html");
		 Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
		 Rectangle passwordRect = driver.findElement(By.id("345")).getRect();
		 int usernameEndX = usernameRect.getX()+usernameRect.getWidth();
		 int passwordStartX = passwordRect.getX();
int space=passwordStartX-usernameEndX;
System.out.println("the space between text field is: "+space);
	}

}
