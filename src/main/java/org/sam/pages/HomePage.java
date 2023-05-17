package org.sam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.driver.DriverManager;

public final class HomePage {
	
	@FindBy(xpath = "//p[contains(text(),'Collings')]")
	private WebElement paulCollingsDropDown;
	
	@FindBy(xpath = "//p[contains(text(),'Collings')]/../../ul/li[4]")
	private WebElement logoutLink;
	
	
	public HomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public HomePage paulCollingsDropDown() {
		paulCollingsDropDown.click();
		return this;
	}
	public LoginPage logoutLink() {
		logoutLink.click();
		return new LoginPage();
	}
	
	

}
