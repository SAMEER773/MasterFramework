package org.sam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.driver.DriverManager;
import org.sam.ennum.WaitStrategy;
import org.sam.utils.ExplicitWait;

public final class HomePage {
	
	
	@FindBy(xpath = "//header[@class='oxd-topbar']/div[1]/div[2]/ul/li/span/p")
	private WebElement paulCollingsDropDown;
	
	@FindBy(xpath = "//header[@class='oxd-topbar']/div[1]/div[2]/ul/li/ul/li[4]")
	private WebElement logoutLink;
	
	
	public HomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public HomePage paulCollingsDropDown() throws Exception {
		new ExplicitWait().click(paulCollingsDropDown, WaitStrategy.CLICKABLE," dropdown");
		//ExtentManager.getExtentTest().pass("Drop DOwn Clicked");
		//ExtentLogger.pass("drop down clicked");
		
		return this;
	}
	public LoginPage logoutLink() throws Exception {
		new ExplicitWait().click(logoutLink, WaitStrategy.CLICKABLE," logoutLink");
		//ExtentManager.getExtentTest().pass("Logout linked Clicked");
		//ExtentLogger.pass("Logout linked Clicked");
		return new LoginPage();
	}
	
	

}
