package org.sam.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sam.driver.DriverManager;
import org.sam.ennum.WaitStrategy;

public class ExplicitWait {

	public void click(WebElement element, WaitStrategy waitstrategy) {

		if (waitstrategy==(WaitStrategy.CLICKABLE)) {
			elementToBeClickable(element);

		} else if (waitstrategy==(WaitStrategy.VISIBLE)) {
			elementVisibiity(element);

		}

		element.click();
	}

	public  void sendKeys(WebElement element, String value, WaitStrategy waitstrategy) {

		if (waitstrategy==(WaitStrategy.CLICKABLE)) {
			elementToBeClickable(element);

		} else if (waitstrategy==(WaitStrategy.PRESENCE)) {
			elementVisibiity(element);

		}
		element.sendKeys(value);
	}

	private static void elementToBeClickable(WebElement forClickAction) {
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(forClickAction));
	}

	private static void elementVisibiity(WebElement sendKeys) {
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.visibilityOf(sendKeys));
	}

}
