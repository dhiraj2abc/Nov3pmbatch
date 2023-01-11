package Webdriverpackage;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchOpera {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("https://www.selenium.dev/");

	}

}
