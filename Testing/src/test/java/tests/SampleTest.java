package tests;

import org.testng.*;
import org.testng.annotations.Test;


public class SampleTest {

	@Test
	public void verifyTest() {
		System.out.println("TestNG Running");
		Assert.assertTrue(true);
	}
}
