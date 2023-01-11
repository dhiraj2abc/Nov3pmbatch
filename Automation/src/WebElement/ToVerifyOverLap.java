package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverLap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DHIRAJ%20KUMAR%20DHAIRYA/Desktop/demo.html");
		 Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
		 Rectangle passwordRect = driver.findElement(By.id("345")).getRect();
		 int usernameEndY = usernameRect.getY()+usernameRect.getHeight();
		 int passwordStartY = passwordRect.getY();
int space=passwordStartY-usernameEndY;
System.out.println(space);
if(space<0){
	System.out.println("they are overlap");
	
	
}
else
{
	System.out.println("they are not overlap");
}

	}

}
