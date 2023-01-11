package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	@Test(groups="smoke")
	public void login() {
		System.out.println("Logged in succesfully");
	}
	@Test(groups="regression")
	public void search() {
		System.out.println("product found");
	}
	@Test(groups="regression")
	public void select() {
		Assert.fail();
		System.out.println("product has not selected");
	}
	@Test(groups="regression")
	public void addToCart() {
		System.out.println("product is addTo cart");
	}
	@Test(groups="regression")
	public void payment() {
		System.out.println("payment made succifully");
	}
	@Test(groups="smoke")
	public void logout() {
		System.out.println("Logged out successfully");
	}
}


