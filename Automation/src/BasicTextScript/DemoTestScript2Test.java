package BasicTextScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScript2Test extends BaseClass  {
	@Test(priority=2)
	public void verifyCustomer() {
		System.out.println("customer has been verifyed");
	}
}
