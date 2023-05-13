package com.sam.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sam.driver.DriverManager;
import org.testng.annotations.Test;

public final class LoginTest extends BaseTest {

	private LoginTest() {

	}

	@Test
	public void loginTest1() throws InterruptedException {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		Thread.sleep(2000);

	}

}
