package org.sam.utils;

import org.sam.pages.HomePage;
import org.sam.pages.LoginPage;

public final class LoginAndLogoutUtility {
	
	public static void login() {
		LoginPage page=new LoginPage();
		try {
			page.userNameTextField(ReadPropertyFile.get("userName").trim())
			.passwordTextField(ReadPropertyFile.get("password").trim()).loginButton();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public static void logout() {
		
		HomePage hm=new HomePage();
		hm.paulCollingsDropDown().logoutLink();
		
		
		
	}
	
	

}
