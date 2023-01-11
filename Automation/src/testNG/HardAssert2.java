package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert2 {
	@Test
	public void demo() {
		String expectedData="abc";
		String actualData="abc";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("pass");
	}

}
