package org.sam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.driver.DriverManager;

public final class LoginPage {
	
	
	@FindBy(name = "username")
	private WebElement userNameTextField;
	
	@FindBy(name = "password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(DriverManager.getDriver(),this);
	}
	
	public LoginPage userNameTextField(String userName) {
		userNameTextField.sendKeys(userName);
		
		return this;
	}
	public LoginPage passwordTextField(String password) {
		passwordTextField.sendKeys(password);
		return this;
	}
	
	public HomePage loginButton() {
		loginButton.click();
		return new HomePage();
	}
	

}
