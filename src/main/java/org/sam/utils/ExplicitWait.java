package org.sam.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sam.driver.DriverManager;
import org.sam.ennum.WaitStrategy;
import org.sam.report.ExtentLogger;

public class ExplicitWait {

	public void click(WebElement element, WaitStrategy waitstrategy, String ele) throws Exception {

		if (waitstrategy==(WaitStrategy.CLICKABLE)) {
			elementToBeClickable(element);

		} else if (waitstrategy==(WaitStrategy.VISIBLE)) {
			elementVisibiity(element);

		}

		element.click();
		ExtentLogger.pass(ele+" is clicked",true);
	}

	public  void sendKeys(WebElement element, String value, WaitStrategy waitstrategy, String ele) {

		if (waitstrategy==(WaitStrategy.CLICKABLE)) {
			elementToBeClickable(element);

		} else if (waitstrategy==(WaitStrategy.PRESENCE)) {
			elementVisibiity(element);

		}
		element.sendKeys(value);
		try {
			ExtentLogger.pass(value+" is entred successfully in "+ele, true);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	private static void elementToBeClickable(WebElement forClickAction) {
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(forClickAction));
	}

	private static void elementVisibiity(WebElement sendKeys) {
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.visibilityOf(sendKeys));
	}

}
