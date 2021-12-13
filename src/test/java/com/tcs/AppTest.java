package com.tcs;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
//Test Eclipse
public class AppTest {
	
	@Test
	public void testApp() {
		App appObject = new App();
		Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
	}

	@Test
	public void test2App() {
		App appObject = new App();
		Assert.assertEquals(appObject.reverseString("12321"), "12321");
	}
}
