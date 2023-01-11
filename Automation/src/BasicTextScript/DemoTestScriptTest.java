package BasicTextScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScriptTest extends BaseClass {
	@Test(priority=1)
	public void verifyHomePageTest() {
		System.out.println("home page has been verifiyed");
	}
	/*@Test(priority=2)
	public void verifyCustomer() {
		System.out.println("customer has been verifyed");
	}
	*/
}
