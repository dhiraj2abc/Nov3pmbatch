package path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/s?k=OnePlus+10R+5G+%28Sierra+Black%2C+12GB+RAM%2C+256GB+Storage%2C+80W+SuperVOOC%29&crid=3IQR34H3O0Q2I&sprefix=oneplus+10r+5g+sierra+black%2C+12gb+ram%2C+256gb+storage%2C+80w+supervooc+%2Caps%2C338&ref=nb_sb_noss_2");
		WebElement price = driver.findElement(By.xpath("//span[text()='OnePlus 10R 5G (Sierra Black, 12GB RAM, 256GB Storage, 80W SuperVOOC)']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='38,999']"));
	   String actualPrice = price.getText();
	   System.out.println(actualPrice);
	
	}

}
