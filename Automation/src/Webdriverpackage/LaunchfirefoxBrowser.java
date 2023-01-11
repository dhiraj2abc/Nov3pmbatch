package Webdriverpackage;

import org.openqa.selenium.WebDriver;

public class LaunchfirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new WebDriver();
		driver.get("https://selenium.dev/");

	}

}
