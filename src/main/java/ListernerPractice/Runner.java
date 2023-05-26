package ListernerPractice;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Runner {

	@BeforeSuite
	public void setUpSuit() {
		System.out.println("before Suit Runner");

	}

	@AfterSuite
	public void tearDoenSuit() {
		System.out.println("After Suit Runner");

	}

	@BeforeMethod
	public void setUP() {
		System.out.println("before Method Runner");

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After Method Runner");

	}

	@Test
	public void test1() {
		
		System.out.println("test1");

	}

	@Test
	public void test2() {
		assertTrue(false);
		System.out.println("test2");

	}

	@Test
	public void test3() {
		System.out.println("test3");

	}

}
