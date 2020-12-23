package testngpackage101;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestngClass {
	
	
	
	

	@Test (priority = 3)
	public void tc1() {
		System.out.println(" my first testng test case");
		Assert.assertEquals(12, 10);
		}
	
	@Test(priority = 1)
	public void tc2() {
		System.out.println(" my first testng test case");
	}
	
	@Test(priority = 0)
	public void tc3() {
		System.out.println(" my first testng test case");
		
		
	}
	
	
	
}
